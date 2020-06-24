/**
 * 
 */
package tn.insat.tp3;

import java.time.Duration;

/**
 * @author ASUS
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Duration duration = Duration.ofSeconds(5);
		Duration minusMillis = duration.minusMillis(3);
		System.out.println(minusMillis);
	}

}
