import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('loginphptravel/phptrave login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Flights/Drop Down-Modules'))

WebUI.mouseOver(findTestObject('Flights/Slide Over-Flight'))

WebUI.click(findTestObject('Flights/Button-Flight Slider'))

WebUI.click(findTestObject('Flights/Button-Edit'))

WebUI.clearText(findTestObject('Flights/Text Box-Title Clear'))

WebUI.setText(findTestObject('Flights/Text Box-Title Set Text'), 'ethiopian')

WebUI.clearText(findTestObject('Flights/Text Box-Price Clear'))

WebUI.setText(findTestObject('Flights/Text Box-Price Set Text'), '125')

not_run: WebUI.click(findTestObject('Flights/Button-Remove Thumbnail'))

WebUI.delay(5)

WebUI.click(findTestObject('Flights/Button-Save and Return'))

WebUI.getText(findTestObject('Flights/Get Text-ethiopian'))

WebUI.verifyNotEqual('Qatar', 'ethiopian')

not_run: WebUI.callTestCase(findTestCase('Add Flight Slider'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Search Flight Added'), [:], FailureHandling.STOP_ON_FAILURE)

