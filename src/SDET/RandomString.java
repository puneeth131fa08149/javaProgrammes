package SDET;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomString {

	public static void main(String[] args) {
		
		//Apache commons -lang API
		// TODO Auto-generated method stub
		String random=RandomStringUtils.randomNumeric(5);
		System.out.println(random);
		
		String ranStr=RandomStringUtils.randomAlphabetic(5);
		System.out.println(ranStr);
		
		//Random Email Id generating
		String email=RandomStringUtils.randomAlphabetic(5);
		System.out.println(email+"@gmail.com");
	}

}
