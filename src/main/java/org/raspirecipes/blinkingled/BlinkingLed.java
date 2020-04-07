package src.main.java.org.raspirecipes.blinkingled;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalInput;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.RaspiPin;

public class BlinkingLed {
	public static void main(String[] args) throws InterruptedException {
		GpioController gpio = GpioFactory.getInstance();
		GpioPinDigitalOutput pin1 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_01);
		GpioPinDigitalInput pin0 = gpio.provisionDigitalInputPin(RaspiPin.GPIO_00);
		boolean led = true;
		/*
		 * for (int i = 0; i < 20; i++) { pin1.setState(led); 
		 * //double temp = pin1.getValue();
		 *  System.out.println(pin1.getState());
		 *  led = !led;
		 * Thread.sleep(500); 
		 * }
		 */
		
		while(true) {
			if(pin0.getState().isLow())
			{
				led = false;
			}
			else {
				led = true;
			}
			pin1.setState(led);
		}
		
		
	}
}