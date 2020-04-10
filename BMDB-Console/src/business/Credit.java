package business;

public class Credit {
	private int id;
	private int ActorID;
	private int MovieID;
	
	public Credit() {
		super();
	}

	public Credit(int id, int actorID, int movieID) {
		super();
		this.id = id;
		ActorID = actorID;
		MovieID = movieID;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getActorID() {
		return ActorID;
	}

	public void setActorID(int actorID) {
		ActorID = actorID;
	}

	public int getMovieID() {
		return MovieID;
	}

	public void setMovieID(int movieID) {
		MovieID = movieID;
	}

	@Override
	public String toString() {
		return "Credit [id=" + id + ", ActorID=" + ActorID + ", MovieID=" + MovieID + "]";
	}
	
	

}
