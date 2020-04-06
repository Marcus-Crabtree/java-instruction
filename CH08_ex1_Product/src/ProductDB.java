public class ProductDB {

    public static Product getProduct(String productCode) {
        // In a more realistic application, this code would
        // get the data for the product from a file or database
        // For now, this code just uses if/else statements
        // to return the correct product data

        Product p = null;

        if (productCode.equalsIgnoreCase("java")
                || productCode.equalsIgnoreCase("jsp")
                || productCode.equalsIgnoreCase("mysql")) {
            Book b = new Book();
            if (productCode.equalsIgnoreCase("java")) {
                b.setCode(productCode);
                b.setDescription("Murach's Java Programming");
                b.setPrice(57.50);
                b.setAuthor("Joel Murach");
            } else if (productCode.equalsIgnoreCase("jsp")) {
                b.setCode(productCode);
                b.setDescription("Murach's Java Servlets and JSP");
                b.setPrice(57.50);
                b.setAuthor("Mike Urban");
            } else if (productCode.equalsIgnoreCase("mysql")) {
                b.setCode(productCode);
                b.setDescription("Murach's MySQL");
                b.setPrice(54.50);
                b.setAuthor("Joel Murach");
            }
            p = b; // set Product object equal to the Book object
        } 
        else if (productCode.equalsIgnoreCase("12rfl")) {
        	Book r = new Book();
        	r.setCode("12rfl");
        	r.setDescription("Twelve Rules for Life");
        	r.setPrice(24.99);
        	r.setAuthor("Dr. Jordan Peterson");
        	p = r;
        }
        else if (productCode.equalsIgnoreCase("netbeans")) {
            Software s = new Software();
            s.setCode("netbeans");
            s.setDescription("NetBeans");
            s.setPrice(0.00);
            s.setVersion("8.2");
            p = s; // set Product object equal to the Software object
        }
        else if (productCode.equalsIgnoreCase("sgtp")) {
        	Album a = new Album();
        	a.setCode("sgtp");
        	a.setDescription("Sgt. Peppers");
        	a.setPrice(14.99);
        	a.setArtist("The Veatles");
        	p = a;
        }
        else if (productCode.equalsIgnoreCase("ES")) {
        	Album m = new Album();
        	m.setCode("es");
        	m.setDescription("Enter the Sandman");
        	m.setPrice(14.99);
        	m.setArtist("Metallica");
        	p = m;
        	
        }
        return p;
    }
}
