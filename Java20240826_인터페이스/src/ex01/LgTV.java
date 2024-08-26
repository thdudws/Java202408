package ex01;

public class LgTV {

	  //전원 power -> on, off -> boolean
	  //소리 sound -. 높이고, 낮추는 기능 -> int
	
	   boolean power;
	   int sound;
	   
	   public LgTV() {   }
	   
	   public void power_On() {
	      this.power = true;
	   }
	   
	   public void power_Off() {
	      this.power = false;
	   }
	   
	   public void sound_up() {
	      this.sound += 1;
	   }
	   
	   public void sound_down() {
	      this.sound -= 1;   
	      if(sound < 0)
	         sound = 0;
	   }
	
}
