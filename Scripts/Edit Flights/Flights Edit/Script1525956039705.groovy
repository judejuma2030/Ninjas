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

WebUI.click(findTestObject('Flights/Modules'))

WebUI.mouseOver(findTestObject('Flights/Flight'))

WebUI.click(findTestObject('Flights/Flight 2'))

WebUI.click(findTestObject('Flights/Qatar Edit'))

WebUI.clearText(findTestObject('Flights/Qatar to KQ'))

WebUI.setText(findTestObject('Flights/Qatar to KQ 2'), 'KQ')

WebUI.clearText(findTestObject('Flights/Price Change 1'))

WebUI.setText(findTestObject('Flights/Price Change 2'), '123')

WebUI.click(findTestObject('Flights/Remove Thumbnail'))

WebUI.click(findTestObject('Flights/Save'))

