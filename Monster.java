public class Monster extends Character{

    //default constructor initializes attributes
    public Monster() {
	hp = 200;
	defense = 40;
	attackRating = 1;
	strength = (int)(Math.random() * 50) + 50;
    }
        //sets defense and attackRating as normal
    public void normalize(){
	attackRating = 1.0;
	defense = 40;
    }

    //sets defense as 10 and attackRating as 2.0
    public void specialize(){
	attackRating = 1.5;
	defense = 20;
    }

    //about
    public String about(){
	return "Monster- Mooks, really. They give it all they've got, though.";
    }
}
