# AugmentedDriverWebExample
Example for using [Augmented Driver](https://github.com/relateiq/AugmentedDriver) for Web  


If you want to run the tests from command line (In Linux based)  

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


