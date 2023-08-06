package stepdefinations;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


@CucumberOptions(features="C:\\Users\\Shuchi Zaifrani\\eclipse-workspace\\ACSACopy5\\src\\test\\resources\\Features\\ExcelRead.feature",glue={"stepdefinations"},
plugin={"pretty:target/cucumber-htmlreport.text", "json:target/cucmber-report.json"},
publish=true)
		




public class TestRunner extends AbstractTestNGCucumberTests{
	
}
