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

WebUI.maximizeWindow()

WebUI.click(findTestObject('AddTour/Modules'))

WebUI.mouseOver(findTestObject('AddTour/MouseOverTours'))

WebUI.click(findTestObject('AddTour/ClickTours'))

WebUiBuiltInKeywords.click(findTestObject('AddTour/Add'))

WebUiBuiltInKeywords.click(findTestObject('AddTour/Status'))

WebUiBuiltInKeywords.click(findTestObject('AddTour/StatusValue'))

WebUI.setText(findTestObject('AddTour/TourName'), 'Safari Tours')

WebUiBuiltInKeywords.setText(findTestObject('AddTour/AdultsQuantity'), '5')

WebUiBuiltInKeywords.setText(findTestObject('AddTour/AdultsPrice'), '2000')

WebUiBuiltInKeywords.click(findTestObject('AddTour/Stars'))

WebUiBuiltInKeywords.delay(2)

WebUiBuiltInKeywords.click(findTestObject('AddTour/StarsValue'))

WebUiBuiltInKeywords.setText(findTestObject('AddTour/TotalDays'), '3')

WebUiBuiltInKeywords.setText(findTestObject('AddTour/TotalNights'), '2')

WebUiBuiltInKeywords.click(findTestObject('AddTour/TourType'))

WebUiBuiltInKeywords.click(findTestObject('AddTour/TourTypeValue'))

WebUiBuiltInKeywords.click(findTestObject('AddTour/Location'))

WebUiBuiltInKeywords.setText(findTestObject('AddTour/EnterLocation'), 'Nairobi')

WebUiBuiltInKeywords.click(findTestObject('AddTour/LocationValue'))

WebUiBuiltInKeywords.setText(findTestObject('AddTour/Deposit'), '500')

WebUiBuiltInKeywords.setText(findTestObject('AddTour/Tax'), '200')

WebUI.delay(5)

WebUiBuiltInKeywords.click(findTestObject('AddTour/Related'))

WebUI.delay(3)

not_run: WebUiBuiltInKeywords.setText(findTestObject('AddTour/Related'), 'Sheraton')

WebUiBuiltInKeywords.click(findTestObject('AddTour/RelatedValue'))

WebUiBuiltInKeywords.click(findTestObject('AddTour/Submit'))

