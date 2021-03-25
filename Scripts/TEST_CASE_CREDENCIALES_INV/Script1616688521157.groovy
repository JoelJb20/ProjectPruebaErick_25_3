import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.amazon.com/-/es/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2FSwitch-GANA-Splitter-Pigtail-Supports%2Fdp%2FB06VX1PKQ7%2Fref%3Dnav_custrec_signin%3F_encoding%3DUTF8%26pd_rd_i%3DB06VX1PKQ7%26pd_rd_r%3D678BMQYFVGA6J80WRXM9%26pd_rd_w%3D2B37N%26pd_rd_wg%3DpyAfN%26psc%3D1%26refRID%3D678BMQYFVGA6J80WRXM9&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&')

WebUI.verifyElementPresent(findTestObject('AmazonLogin/Page_Amazon Iniciar sesin/input_Direccin de correo electrnico o nmero de telfono mvil_email'), 
    0)

WebUI.verifyElementClickable(findTestObject('AmazonLogin/Page_Amazon Iniciar sesin/input_Direccin de correo electrnico o nmero de telfono mvil_email'))

WebUI.click(findTestObject('AmazonLogin/Page_Amazon Iniciar sesin/input_Direccin de correo electrnico o nmero de telfono mvil_email'))

WebUI.setText(findTestObject('AmazonLogin/Page_Amazon Iniciar sesin/input_Direccin de correo electrnico o nmero de telfono mvil_email'), 
    GlobalVariable.USER_INVALIDO)

WebUI.click(findTestObject('AmazonLogin/Page_Amazon Iniciar sesin/input_Escriba su correo electrnico o su nmero de telfono mvil_continue'))

WebUI.verifyElementPresent(findTestObject('AmazonFail/Page_Amazon Iniciar sesin/span_No pudimos encontrar una cuenta con esa direccin de correo electrnico'), 
    0)

WebUI.closeBrowser()

