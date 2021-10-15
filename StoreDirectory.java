package Project1;

public class StoreDirectory {
	private Bookstore bookstore;
	private Market market;
	public StoreDirectory(String custId){
		bookstore = new Bookstore(custId);
		market = new Market();
	}

	public int getNumberOfBooks() {
		return bookstore.getNumBooks();
	}
	public int getNumberOfBookstoreEmployees() {
		//Done
		return bookstore.getNumEmployees();
	}

	public boolean addNewEmployee(String employeeId){
		//done
		if(bookstore.addNewEmployee(employeeId))
			return true;
		else
			return false;
	}
	public boolean bookIsInStock(String bookId){
		//done
		return  bookstore.bookIsInStock(bookId);
	}
	public boolean addNewBook(String bookId){
		//Done
		try{
			bookstore.addNewBook(bookId);
		}catch (Exception e){
			System.out.println("Error " + e.getMessage());
			return false;
		}
		return true;
	}
	public boolean marketCarriesFoodItem(String foodItem){
		//done
		return market.carriesFoodItem(foodItem);
	}
}
