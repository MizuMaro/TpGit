package iut.tdd;

import junit.framework.Assert;

import org.junit.Test;

public class TestConvert {

    @Test
    public void test_num2text_zero() {

        Assert.assertEquals("zéro", Convert.num2text("0"));
    }

    @Test
    public void test_num2text_un() {
        Assert.assertEquals("un",Convert.num2text("1"));
    }

    @Test
    public void test_num2text_deux() {
        Assert.assertEquals("deux", Convert.num2text("2"));
    }

    @Test
    public void test_num2text_trois() {
        Assert.assertEquals("trois", Convert.num2text("3"));
    }

    @Test
    public void test_num2text_quatre() {
        // Given
        String input = "4";
        String expected = "quatre";
        Convert myConvert = new Convert();
        // When
        String actual = myConvert.num2text(input);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test_num2text_cinq() {
        // Given
        String input = "5";
        String expected = "cinq";
        Convert myConvert = new Convert();
        // When
        String actual = myConvert.num2text(input);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test_num2text_six() {
        // Given
        String input = "6";
        String expected = "six";
        Convert myConvert = new Convert();
        // When
        String actual = myConvert.num2text(input);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test_num2text_sept() {
        // Given
        String input = "7";
        String expected = "sept";
        Convert myConvert = new Convert();
        // When
        String actual = myConvert.num2text(input);
        // Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    	public void test_num2text_huit () {
		// Given
		String input = "8";
		String expected = "huit";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
    @Test
        	public void test_num2text_neuf () {
		// Given
		String input = "9";
		String expected = "neuf";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
    @Test
                	public void test_num2text_ () {
		// Given
		String input = "10";
		String expected = "dix";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
    @Test
                	public void test_num2text_onze () {
		// Given
		String input = "11";
		String expected = "onze";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
    @Test
                	public void test_num2text_douze () {
		// Given
		String input = "12";
		String expected = "douze";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}



}
