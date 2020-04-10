package db;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import business.User;

public class UserDB implements DAO<User> {

	private Connection getConnection() throws SQLException {
		String dbURL = "jdbc:mysql://localhost:3306/prs";
		String username = "prs_user";
		String password = "sesame";
		Connection conn = DriverManager.getConnection(dbURL, username, password);
		return conn;

	}

	public User login(String un, String pw) {
		String getUserQuery = "SELECT * FROM User WHERE username =? and password = ?";
		User user = null;
		try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(getUserQuery)) {
			ps.setString(1, un);
			ps.setString(2, pw);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				user = getUserFromResultSet(rs);
			}
			else {
				//no user found for un,pw
			}
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public User get(int id) {
		String getUserQuery = "SELECT * FROM User WHERE Id = ?";
		User user = null;
		try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(getUserQuery)) {
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				user = getUserFromResultSet(rs);
			}
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public List<User> list() {
		String sql = "SELECT * from User";
		List<User> users = new ArrayList<>();
		try (Connection conn = getConnection();
				PreparedStatement ps = conn.prepareStatement(sql);
				ResultSet rs = ps.executeQuery()) {
			// while there is a row in the result set rs
			while (rs.next()) {
				User u = getUserFromResultSet(rs);
				users.add(u);
			}

		} catch (SQLException e) {
			e.printStackTrace();
			users = null;
		}

		return users;
	}

	private User getUserFromResultSet(ResultSet rs) throws SQLException {
		// int id = rs.getstring("id");
		int id = rs.getInt(1);
		String un = rs.getString(2);
		String pw = rs.getString(3);
		String fn = rs.getString(4);
		String ln = rs.getString(5);
		String pn = rs.getString(6);
		String em = rs.getString(7);
		boolean r = rs.getBoolean(8);
		boolean a = rs.getBoolean(9);
		User u = new User(id, un, pw, fn, ln, pn, em, r, a);
		return u;
	}

	@Override
	public boolean add(User u) {
		boolean success = false;
		String sql = "INSERT into User (UserName, PassWord, FirstName,"
				+ " LastName, PhoneNumber, Email, Isreviewer, IsAdmin)" + " values (?,?,?,?,?,?,?,?) ";
		try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setString(1, u.getUserName());
			ps.setString(2, u.getPassword());
			ps.setString(3, u.getFirstName());
			ps.setString(4, u.getLastName());
			ps.setString(5, u.getPhoneNumber());
			ps.setString(6, u.getEmail());
			ps.setBoolean(7, u.isReviewer());
			ps.setBoolean(8, u.isAdmin());
			ps.executeUpdate();
			success = true;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return success;
	}

	@Override
	public boolean update(User u) {
		// leaving this alone for now
		return false;
	}

	@Override
	public boolean delete(User u) {
		boolean success = false;
		String sql = "DELETE from User WHERE id =?";
		try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1, u.getId());
			ps.execute();
			success = true;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return success;
	}

}
