package com.example.timetotext;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalTime;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void timeValueEightFiftyFourInTheMorning() {
		//Set up
		LocalTime time = LocalTime.of(8,54,0);
		TimeToTextConverter converter = new TimeToTextConverter();

		//Exercise
		String timeInText=converter.time2text(time);

		//Assert
		assertThat(timeInText,is("eight fifty-four in the morning"));
	}

	@Test
	public void timeValueSevenThirtyFourInTheMorning() {
		//Set up
		LocalTime time = LocalTime.of(7, 34,0);
		TimeToTextConverter converter = new TimeToTextConverter();

		//Exercise
		String timeInText=converter.time2text(time);

		//Assert
		assertThat(timeInText,is("seven thirty-four in the morning"));
	}
	@Test
	public void timeValueThreeThirtySevenInTheMorning() {
		//Set up
		LocalTime time = LocalTime.of(3, 37,0);
		TimeToTextConverter converter = new TimeToTextConverter();

		//Exercise
		String timeInText=converter.time2text(time);

		//Assert
		assertThat(timeInText,is("three thirty-seven in the morning"));
	}

	@Test
	public void timeValueNineFourteenInTheMorning() {
		//Set up
		LocalTime time = LocalTime.of(9, 14,0);
		TimeToTextConverter converter = new TimeToTextConverter();

		//Exercise
		String timeInText=converter.time2text(time);

		//Assert
		assertThat(timeInText,is("nine fourteen in the morning"));
	}
	@Test
	public void timeValueTenSixteenInTheMorning() {
		//Set up
		LocalTime time = LocalTime.of(10, 16,0);
		TimeToTextConverter converter = new TimeToTextConverter();

		//Exercise
		String timeInText=converter.time2text(time);

		//Assert
		assertThat(timeInText,is("ten sixteen in the morning"));
	}
	@Test
	public void timeValueElevenOhSixInTheMorning() {
		//Set up
		LocalTime time = LocalTime.of(11, 06,0);
		TimeToTextConverter converter = new TimeToTextConverter();

		//Exercise
		String timeInText=converter.time2text(time);

		//Assert
		assertThat(timeInText,is("eleven oh six in the morning"));
	}

	@Test
	public void timeValueThreeOhThreeInTheAfternoon() {
		//Set up
		LocalTime time = LocalTime.of(15, 03,0);
		TimeToTextConverter converter = new TimeToTextConverter();

		//Exercise
		String timeInText=converter.time2text(time);

		//Assert
		assertThat(timeInText,is( "three oh three in the afternoon"));
	}

	@Test
	public void timeValueSixOhFiveInTheEvening() {
		//Set up
		LocalTime time = LocalTime.of(18, 05,0);
		TimeToTextConverter converter = new TimeToTextConverter();

		//Exercise
		String timeInText=converter.time2text(time);

		//Assert
		assertThat(timeInText,is( "six oh five in the evening"));
	}



	@Test
	public void timeValueQuarterPastNineInTheEvening() {
		//Set up
		LocalTime time = LocalTime.of(21, 15,0);
		TimeToTextConverter converter = new TimeToTextConverter();

		//Exercise
		String timeInText=converter.time2text(time);

		//Assert
		assertThat(timeInText,is( "quarter past nine in the evening"));
	}

	@Test
	public void timeValueQuarterToTenInTheEvening() {
		//Set up
		LocalTime time = LocalTime.of(21, 45,0);
		TimeToTextConverter converter = new TimeToTextConverter();

		//Exercise
		String timeInText=converter.time2text(time);

		//Assert
		assertThat(timeInText,is( "quarter to ten in the evening"));
	}

	@Test
	public void timeValueHalfPastNineInTheEvening() {
		//Set up
		LocalTime time = LocalTime.of(21, 30,0);
		TimeToTextConverter converter = new TimeToTextConverter();

		//Exercise
		String timeInText=converter.time2text(time);

		//Assert
		assertThat(timeInText,is( "half past nine in the evening"));
	}

	@Test
	public void timeValueNoon() {
		//Set up
		LocalTime time = LocalTime.of(12, 00,0);
		TimeToTextConverter converter = new TimeToTextConverter();

		//Exercise
		String timeInText=converter.time2text(time);

		//Assert
		assertThat(timeInText,is( "noon"));
	}

	@Test
	public void timeValueMidnight() {
		//Set up
		LocalTime time = LocalTime.of(00, 00,0);
		TimeToTextConverter converter = new TimeToTextConverter();

		//Exercise
		String timeInText=converter.time2text(time);

		//Assert
		assertThat(timeInText,is( "midnight"));
	}
}

