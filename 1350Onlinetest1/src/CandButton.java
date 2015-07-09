
public class CandButton extends BallotUnit {
	
	int ButtonPressed=0;
	

	public int getButtonPressed() {
		return ButtonPressed;
	}

	public void setButtonPressed(int buttonPressed) {
		ButtonPressed = buttonPressed;
	}

	CandButton(){
		
		
	}

	@Override
	public void ButtonPressed() {
		// TODO Auto-generated method stub
		
		if(ButtonPressed==0){
			
			System.out.println("Voted");
		}
		
		else{
			System.out.println("No vote");
		}
		
	}

}
