package q10modifyingThrowInSubClass;

class Q10 {
	
	public void total() throws RuntimeException{
		//if we are mentioning Exception then sub class should have child exception for Exception
	}

}

class SubClass extends Q10{

	@Override
	public void total() throws ArithmeticException {
		// TODO Auto-generated method stub
		super.total();
	}

}
