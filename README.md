# AugmentedDriver Web Example
Example for using [Augmented Driver](https://github.com/relateiq/AugmentedDriver) for Web  

***  

Check [our 5 Minute Tutorial](www.google.com) on how to use the tool.  

Also, for more detailed information, the [Wiki](https://github.com/relateiq/AugmentedDriver/wiki/Augmented-Driver) is available  
***  

If you want to run the tests from command line (Linux based)  

* Make sure to have Selenium running in port 7777 (or configure it properly in augmented.properties) if you are going to run the  test/suite locally
* For test, run for example  

```
./scripts/runTestLocal.sh com.salesforceiq.example.ExampleTest  searchForSalesforceIQInWiki capabilities/chrome.yaml 3 3
```
or  
```
./scripts/runTestSauce.sh com.salesforceiq.example.ExampleTest  searchForSalesforceIQInWiki capabilities/chrome.yaml 3 3
```

* For a suite, run  
```
./scripts/runSuiteSauce.sh SMOKE com.salesforceiq.example capabilities/chrome.yaml
```
or  
```
./scripts/runSuiteLocal.sh SMOKE com.salesforceiq.example capabilities/chrome.yaml
```  

For running in SauceLabs, remember to set _SAUCE_KEY_ and _SAUCE_USER_ in the properties file (augmented.properties)

For running directly, use  
```
com.salesforceiq.augmenteddriver.runners.TestSuiteRunner -suites SMOKE -suitesPackage com.salesforceiq.example -capabilities capabilities/chrome.yaml -sauce
```
or  
```
com.salesforceiq.augmenteddriver.runners.TestMethodRunner -clazz com.salesforceiq.example.ExampleTest -test searchForSalesforceIQInWiki -capabilities capabilities/chrome.yaml -quantity 3 -parallel 3
```  


