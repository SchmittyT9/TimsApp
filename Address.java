public class Address
{
	/*
	FIELDS
	*/
	String street;
	int postcode;
	String state;

	/*
	CONSTRUCTION
	*/
	public Address()
	{
		setStreet("0 Test Street");
		setPostcode(1000);
		setState("WA");
	}

	public Address(String inStreet, int inPostcode, String inState)
	{
		setStreet(inStreet);
		setPostcode(inPostcode);
		setState(inState);
	}

	/*
	MUTATORS
	*/
	public void setStreet(String newStreet)
	{
		street = newStreet;
	}

	public void setPostcode(int newPostcode)
	{
		postcode = newPostcode;
	}

	public void setState(String newState)
	{
		state = newState;
	}

	/*
	ACCESSORS
	*/
	public String getStreet()
	{
		return street;
	}

	public int getPostcode()
	{
		return postcode;
	}

	public String getState()
	{
		return state;
	}

	/*
	OTHER
	*/
	public String toString()
	{
		return street + ", " + state + ", " + postcode;
	}

}















