# Test Report

| Contents                                               |
| :----------------------------------------------------- |
| [Team Management](#team-management)                    |
| [Test Specification](#test-specification)              |
| [Test Plan](#test-plan)                                |
| [Jump to Class: BoCTransaction](#class-boctransaction) |
| [Jump to Class: BoCCategory](#class-boccategory)       |
| [Jump to Class: BoCApp](#class-bocapp)                 |
| [Integration Test](#integration-test-log)                 |

## Team Management
Report here, by the end of the assignment, how the team has managed the project, e.g.: used version control, organised meetings, divided work, used labels, milestones, issues, etc. etc.

###  1. Team orgnization
#### 1.1. The Test and Develop Team
* Teams for **BoCCategory class**
    * `Team A` 
        * **Lin Chen** (20215609 @biylc2)
        * **Leshan Tan** (20215578 @sqylt2)
    * `Team B`
        * **Ziyi Wang** (20215785 @scyzw10)
        * **Zixiang Hu** (20215538 @scyzh6)
    * `Team C` 
        * **Yicun Duan** (20216268 @scyyd3)
        * **Yingxiao Huo** (20216910 @scyyh9)

* Teams for **BoCTransaction / BoCApp class**

    `The reason for doing team change is until April 19th , we are taught QA team. We think it is important so we adjust our strategy`

    * `Team A` 
        * **Lin Chen** (20215609 @biylc2)
        * **Yicun Duan** (20216268 @scyyd3)
    * `Team B` 
        * **Ziyi Wang** (20215785 @scyzw10)
        * **Leshan Tan** (20215578 @sqylt2)
        * **Yingxiao Huo**(20216910 @scyyh9)

* Tasks:

    1. Follow the guidelines introduced in the lecture to do Test Driven Development. They are:
        * Create a unit test that fails.
        * Write the unit tests that are complied and sufficiently good enough.
        * Write the production codes that pass the unit tests.

    2. Work in paires to test functions and fix bugs.
        * One person checkes / reviews while other person codes.
        * Take turns to write functions and check codes.
        * For both team members,after testing, filling the test report is expected.  

    3. Change pairs for good practice formally spread
      
    4. By the end of the program, they will have to check the program with the QA member again.



#### 1.2. The QA Member

*   **Zixiang Hu** (20215538 @scyzh6)

* Tasks:
  1. Design the team [workflow](#2-workflow-and-discussions) and documentation system to ensure work efficiency and traceability;
  2. Define [standards](#44-standard-quality-check-requirements) and make sure all of the doucumented / changed file meets the requirements
  3. Approve merge requests only if the changes meet the specifications.
  4. Arrange meetings for the error collection and expected improvements after each stage is finished
  5. Encourage to comment and in the GitLab.
  6. Make sure everyone has his/her tasks using [Milestones](and remind them to complete it on time.
  7. Help team members with technical issues and introduce useful [methods](junit.md) to solve the problem.
  8. Hold discussions for some difficult problem happened while coding/ testing
  9. Check the test coverage and do the `version control`

### 2. Workflow and Discussions

**[Overview]**<br>
    <img src="timeline.png" height = 400>

 **[Meeting]** All members discuss and design a template documentation of test plan and test log.


1. **[Milestone]** :  ***"Write test script for BoC Transaction Class"***

   **[Duedate]**:  ***"Apr 22, 2021"***
   
    * **[Assignment]** `Team A`: ~Issue Assigned:  #7 make test plan and implement test code for `BoCTransaction` on a separated branch.
    * **[Assignment]** `Team B`: ~Issue Assigned: #6 make test plan and implement test code for `BoCCategory` on a separated branch.
 * **[Assignment]** `Team C`: ~Issue Assigned: #4, #5 make test plan and implement test code for `BoCCategory` on a separated branch.
   
    * **[Problem solving]** ~ Cannot open idea projects using Eclipse. (Finally we decide to configure the same working environment, and run on the same ide: IDEA)
    * **[Discussion]** ~ Discuss how to use git to make our project in order [~ see Git usage].
    * **[Meeting]** ~ Introduce how to use `csvSourceFile` and how to test `Setter` and `Getter` together.
    * **[Discussion]** ~ Discuss what the default constructer actually do and the expected output.
    * **[Discussion]** ~ Discuss how to test `Date` object.
    * **[Discussion]** ~ Discuss how to test the `BigDecimal` type using as it can accept 4 types.
    * **[Discussion]** ~Discuss how to test main constructor in just one method
    * **[OfficeHour]** ~Ask teacher the list of 
    problems we encountered [Question](question.md)
    * **[Meeting]** How to combine separate methods into one file. 
    * **[+ [Review] +]** Check all the functions are tested and swap to check others' codings. Check the variety use of assert functions.
    * **[+ [Merge] +]** After each issue is solved, we merge that branch of issue into master.


2. **[Milestone]** : ***"Write the test script for BoC Category Class"***
    **[Duedate]**:  ***"Apr 25, 2021"***
    
    * **[Assign & [+ Branch +]]** `Team A`: ~Issue Assigned: #14, #18, #20, #23, #26, #27 make test plan and implement test code for `BoCTransaction` on a separated branch 
    * **[Assign & [+ Branch +]]** `Team B`: ~Issue Assigned: #12, #13, #15, #16, #17, #19, #21, #25 Fix `BoCCategory` following TDD on a separated branch.
    * **[Meeting]** ~Reorganize our team and make Zixiang Hu to be our QA member,reassign the tasks.
    * **[Meeting]** ~What exceptions are expected to thrown for each cases.
    * **[Discussion&&OfficeHour]** ~ How to test a unique Category name of the default constructor of `BoCCategory`.
    * **[Comment]** ~ What is the acceptable parameter for setCategoryBudget function. 
    * **[Comment]** ~ How to test null input from the csv file.
* **[ProblemLeaving]** ~ Cannot use `Arguments.of` @MethodSource
    * **[+ [Review] +]** ~Completeness of our function test
* **[Discussion]** ~Two ways of testing addExpense function,which one is more logical.
    * **[Meeting]** Error collections/Improvements and uncompleted tasks. Swap to review others' coding and inspect various method for testing.
    * **[+ [Merge] +]** After each issue is solved, we merge that branch of issue into master.
    
3. **[Milestone]**:  ***"Fix script for BoC Transaction Class && BoC Category Class"***

    **[Duedate]**:  ***"Apr 27, 2021"***

    * **[Assign & [+ Branch +]]** `Team A`: ~Issue Assigned: #44, #45, #48 Each team member fix corresponding part of `BoCCategory` following TDD on a separated branch.
    * **[Assign & [+ Branch +]]** `Team B`: ~Issue Assigned: #21, #28, #37, #46, #47 Each team member fix corresponding part of `BoCCategory` following TDD on a separated branch.
    * **[Discussion]** ~When to fix bugs: before the app test or after the app test
    * **[Meeting]** ~ How to create unique default constructor.
    * **[Comment]** ~When to fix setCategoryBudget as it will influence BoCApp. 
    * **[Meeting]** ~Refactoring code together
    * **[+ [Review] +]** ~ Completeness of our function test
    * **[Comment]** ~Change for the return type of isComplete function .
    * **[Discussion]** ~ Discuss the format of the test log.
    * **[+ [Merge] +]** The report with test log and refactored function.
    * **[Meeting]** ~ Change the format of the test function and test log.
    * **[+[Review]+]** ~ Swap to check team members' function and give some suggestions
4. **[Milestone]**:  ***"Write the test script for BoC App Main Class"***
    **[Duedate]**:  ***"Apr 27, 2021"***
    
    * **[Assign]** ~ Done
    * **[Meeting]** ~ Introduce a static function and global varibles used for all the tests in the BoCAppTest class. 
    * **[Discussion]** ~Discuss about other methods for testing the I/O
    * **[Meeting]** ~ Discuss all the possible situations that may happen in the AppTest.
* **[+ [Coverage Test] +]** ~ Check the test code coverage using `run with Coverage` in the IDEA.
  
5. **[Milestone]**:  ***"Fix script for BoC App Main Class"***
   
    * **[Assign]**: ~ Done
    * **[Meeting]** Refactor main method together.
    * **[Discussion]** ~Discuss how to solve the problem caused by the difference between'\r\n' '\n' in windows and linux system(one of our teammate use ubutu to write & run the code)


### 3. `GitLab` Usage
1. Issues
    * Issues are used for fixing specific bugs,we have an issue for each function test. If the function requires code modification, a new issue is created for fixing this bug.
    * Each issue have a corresponding branch with a specific branch name created by Git. However, branch in early stage is deleted, as at that time we thought leave all the branches there is messy.
    * When developers encounter a problem,they may comment below their issues. If others can solve the problem, they will give their answers under the comment. It helps the coodination between team members.
    * `Assignee` ,` Due date` --- who will solve the problem and by when. QA member will check the due date and remind the team member if the task is overdue.
    * `Labels`, `Milestone` --- for which subproject and the type of issue.
    * **[+ Create merge request and branch +]** : After an issue is fixed, it should be merged into the master branch after being checked.

2. Labels
    * ~"" Lists to-do items as reminders.
    * ~Doing Ongoing events - should be finished before the due date.
    * ~Done Archives finished tasks.
    * ~Discussion Record meetings and discuss problems one encounters with the whole team.
    * ~Tips Share methodologies, tools, experiences with the whole team.
    * ~Bugs Report bugs find for later analysis.
3. Issue Boards
    * An overview of all the tasks and progress.
4. Commit messages
    * Commit messages mainly tells what the modification has been done on which test.
5. Milestones
    * Are used to assign a subproject,which consists of lots of issues. And it can be used to track the the completeness of subprocess, the participations of team members.
6. Merge Requests
    * Are expected to have `pictures` of what modifications have been done to the file and its output(for test). `[newly improved for readability]`
    * All merge request should be approved by Zixiang Hu after checking the correctness.

7. Tags
    * Tags will be used for version control.


### 4. Quality Assurance
#### 4.1 Pair programming
  * One person thinks/checkes while other person codes. And the pair changes.
#### 4.2 Code Review
  * The QA member will mainly focus on this problem and associate with the team member directly whether by discussion or using comment.
  * Have a meeting about error collections after each stage
#### 4.3 Regression Testing 
  * Regression Testing are required each time the code is modifies to ensure that other functions can process correctly.

#### 4.4 `[Standard quality check requirements]`
  * Use table to check whether meet the requirements after fixing.

#### 4.5 Independent QA Team
  * Regularly check submitted code and provide suggestions accordingly.
  * Ensure the style consistency among the whole project.
### 5. Traceability
#### 5.1 Cross-Reference
  * Unique IDs are assign to each test plan and test log

    **Format**:
    * `TS` - test, `IN`- integration test
    * Class name
    * `The number of the subtest according to the requirements` - `its test case number`.

* Theses IDs are referenced among:
    * `Test Plan` and `Test Log` documentation, where these IDs are defined;
    * `JUnit` test code using `@DisplayName` before each test;

#### 5.2 History
  * Code modifications:
    * `When`: In the function, it used last modified time, but in the `Test Log`, all the test times are expected.
    * `Why`: Why change this code.
    * `Who`: The tester or modifier.
    * `How`: Written in the `Test Log` or in the merge request pics.

### 6. Standards
 #### 6.1 Programming standards
 * Software: IntelliJ IDEA 
 * Environment: Java version 15.0.2 
 * Coding conventions:
   * `Naming variables`: Camel case / related to its purpose
   * `Naming file names`: Underscore case
   * `Naming functions`: relate to the method's functionality
   * Have method header format
   * Add `comments`
   * depth of conditional nesting cannot be more than 10 lines
   * length of code are expected to be in 50 lines
   * No duplicate code in the same class or other class
   * Declare global variables only if necessary to use in the other methods
   * Double check creation of static variables inside a class;
    * Avoid accessing variables directly from other classes instead use getter and setter methods

 #### 6.2 Standard quality check requirements
1. Control the visibility of information in a program 
1. Check all inputs for validity 
1. Provide a handler for all exceptions
1. Minimize the use of error-prone constructs 
1. Provide restart capabilities 
1. Check array bounds 
1. Include timeouts when calling external components 
1. Name all constants that represent real-world values

![Detailed](standards_for_check.png)

### Methods
[Docs for using methods](junit.md)







## Test Specification


### Test importance marking system

| Importance Level |   Importance   | Description                                                  | Example                                                      |
| :--------------: | :------------: | ------------------------------------------------------------ | ------------------------------------------------------------ |
|        1         |   **`Low`**    | whether the program could interact with user in a **human-friendly** way  | e.g. Confusing prompt message                          |
|        2         | **`Moderate`** | whther the program is able to get through some **few-reached cases** | e.g. The input is BigDecimal("0110101010")                                  |
|        3         |  **`Major`**   | whether the program could deal with **common exceptions** | e.g. A negative transaction value                                |
|        4         | **`Critical`** | whether the program meets users' **basic requirements**   | e.g. A normal transaction record                                 |
|        5         |  **`Fatal`**   | whether the program hinters the **ridiculous outcome** | e.g. When user changes the category of a transaction, the expense of its original category is unchanged. |

`Note that "mess up user data" is of highest importance because this is a FINANCIAL app where wrong data is severer than program crash.`

### Test Coverage

| Class | Method Coverage | Line Coverage |
|----|--|---|
|BoCCategory| 100% | 98% |
|BoCTransaction| 100% | 100% |
|BoCApp| 100% | 100% |


[Click here to see coverage report](coverageReport/.empty/index.html)
![testCoverage](coverage.png)

***Note:*** Previous code implementation did not handle exceptions in methods well, so  they need to be handled in main. But after the modification, all the exceptions can be handled in methods without being thrown in main, therefore the catch statement in main will never be reached at present. **Therefore, there is 2% of line can not be reached, as this two line is ment for exception handling.**


## Test Plan and Test Log

***Note:*** 
- In the Test Log's Modification column, the character in \[Content ()\] have three options: M stands for modification, A stands for addition, D stands for deletion

### *Class:* `BoCTransaction`
### **Test Plan**
`Test Schedule:` <br>
***"Write test script for BoC Transaction Class"***<br>
***"Fix script for BoC Transaction Class && BoC Category Class"***

|Test ID|Type|Inputs|Expected Outcome|Importance|
|----|---------|------|----------------|-------|
|**[TS-Transaction 1-1]**|**[Validation Test]:**<br>Test constructor with no parameters|-|<table border="1"><tr><td>test.transactionName == "[Pending Transaction]"</td></tr><tr><td>test.transactionValue == null</td></tr><tr><td>test.transactionCategory == 0</td></tr><tr><td>test.transactionTime == new Date() // current time</td></tr></table>|2|
|**[TS-Transaction 2-1]**|**[Validation Test]:**<br>Test main constructor with **normal** input parameters |<table border="1"><tr><th>transactionName: </th><th>transactionBudget</th><th>transactioncategory</th><tr><td>"Buy an apple"</td><td>2</td><td>2</td></tr></table>|<table border="1"><tr><th>transactionName: </th><th>transactionBudget</th><th>transactioncategory</th><tr><td>"Buy an apple"</td><td>2</td><td>2</td></tr></table>|2|
|**[TS-Transaction 2-2]**|**[Validation Test]:**<br>Test main constructor with **normal** input parameters |<table border="1"><tr><th>transactionName: </th><th>transactionBudget</th><th>transactioncategory</th><tr><td>"Buy an apple pen"</td><td>998</td><td>3</td></tr></table>|<table border="1"><tr><th>transactionName: </th><th>transactionBudget</th><th>transactioncategory</th><tr><td>"Buy an apple pen"</td><td>998</td><td>3</td></tr></table>|2|
|**[TS-Transaction 2-3]**|**[Defect Test]:**<br>Test main constructor with input transaction name **longer than 25 character**|<table border="1"><tr><th>transactionName: </th><th>transactionBudget</th><th>transactioncategory</th><tr><td>"Go to Apple store and buy an apple pen"</td><td>998</td><td>3</td></tr></table>|Throw `[IllegalArgumentException]`:<br> "Transaction name should be limited to 25 characters."|3|
|**[TS-Transaction 2-4]**|**[Defect Test]:**<br>Test main constructor with **null input** transaction name|<table border="1"><tr><th>transactionName: </th><th>transactionBudget</th><th>transactioncategory</th><tr><td>***null***</td><td>998</td><td>3</td></tr></table>|Throw `[IllegalArgumentException]`: <br>"Transaction name should not be null."|3|
|**[TS-Transaction 2-5]**|**[Defect Test]:**<br>Test main constructor with **null transaction budget**|<table border="1"><tr><th>transactionName: </th><th>transactionBudget</th><th>transactioncategory</th><tr><td>"Buy an apple pen"</td><td>***null***</td><td>3</td></tr></table>|Throw `[IllegalArgumentException]`: <br>"Transaction budget should not be null."|3|
|**[TS-Transaction 2-6]**|**[Defect Test]:**<br>Test main constructor with **transaction category less than zero**|<table border="1"><tr><th>transactionName: </th><th>transactionBudget</th><th>transactioncategory</th><tr><td>"Buy an apple pen"</td><td>988</td><td>-3</td></tr></table>|Throw `[IllegalArgumentException]`: <br>"Transaction category should not be minus."|3|
|**[TS-Transaction 2-7]**|**[Defect Test]:**<br>Test main constructor with transaction budget less than or equal to zero|<table border="1"><tr><th>transactionName: </th><th>transactionBudget</th><th>transactioncategory</th><tr><td>"Buy an apple pen"</td><td>0</td><td>3</td></tr><tr><td>"Buy an apple pen"</td><td>-998</td><td>3</td></tr></table>|Throw `[IllegalArgumentException]`: <br>"Transaction budget should greater than zero."|3|
|**[TS-Transaction 3-1]**|**[Validation Test]:**<br>Test transaction name|<table border = "1"><tr><th>transactionName</th></tr><tr><td>Yingxiao Huo</td></tr></table>|<table border = "1"><tr><th>transactionName</th></tr><tr><td>Yingxiao Huo</td></tr></table>|2|
|**[TS-Transaction 3-2]**|**[Defect Test]:**<br>test when transaction name is null|<table border = "1"><tr><th>transactionName</th></tr><tr><td>null</td></tr></table>|Throw `[IllegalArgumentException]`:"name is not set."|3|
|**[TS-Transaction 4-1]**|**[Defect Test]:**<br>Test the transactionValue() with default constructor and input value source| <table border="1"><tr><th>TransactionValue: </th></tr><tr><td>BigDecimal("-100000")</td></tr><tr><td>BigDecimal("-1.11111")</td></tr><tr><td>BigDecimal("0")</td></tr><tr><td>BigDecimal("0.00")</td></tr><tr><td>BigDecimal("0.001")</td></tr><tr><td>BigDecimal("1")</td></tr><tr><td>BigDecimal("1.00000")</td></tr><tr><td>BigDecimal("999999999999999")</td></tr><tr><td>BigDecimal("999999999999999.999999999999999")</td></tr><tr><td>BigDecimal("0001010010")</td></tr><tr><td>BigDecimal("3.1415926535E+8")</td></tr><tr><td>BigDecimal("3.1415926535E-8")</td></tr></table> | <table border="1"><tr><th>TransactionValue: </th></tr><tr><td>IllegalArgumentException("transactionValue should be larger than zero.")</td></tr><tr><td>IllegalArgumentException("transactionValue should be larger than zero.")</td></tr><tr><td>IllegalArgumentException("transactionValue should be larger than zero.")</td></tr><tr><td>IllegalArgumentException("transactionValue should be larger than zero.")</td></tr><tr><td>BigDecimal("0.001")</td></tr><tr><td>BigDecimal("1")</td></tr><tr><td>BigDecimal("1.00000")</td></tr><tr><td>BigDecimal("999999999999999")</td></tr><tr><td>BigDecimal("999999999999999.999999999999999")</td></tr><tr><td>BigDecimal("0001010010")</td></tr><tr><td>BigDecimal("3.1415926535E+8")</td></tr><tr><td>BigDecimal("3.1415926535E-8")</td></tr></table> |3|
|**[TS-Transaction 5-1]**|**[Validation Test]:**<br>Test to set whether the number get is correct or not|<table border="1"><tr><th colspan = "4">*input*</th></tr><tr><td>0</td></tr><tr><td>1</td></tr><tr><td>5</td></tr><tr><td>100</td></tr></table>|<table border="1"><tr><th>*.**transactionCategory()**</th></td><tr><td>0</td></tr><tr><td>1</td></tr><tr><td>5</td></tr><tr><td>100</td></tr></table>|2|
|**[TS-Transaction 6-1]**|**[Validation Test]:**<br>Test if the time is correctly return|<table border="1"><tr><th>transactionName: </th><th>transactionBudget</th><th>transactioncategory</th><tr><td>"A test"</td><td>200</td><td>2</td></tr><tr><td>"Another test"</td><td>200</td><td>3</td></tr><tr><td>null</td><td>null</td><td>2</td></tr></table>|<table border="1"><th>transactionTime</th><tr><td>Time when the transaction is recored </td></tr></table>|2|
|**[TS-Transaction 7-1]**|**[Validation Test]:**<br>Test setting transaction name to different values|<table border="1"><tr><th>transactionName: </th></tr><tr><td>"Eren Joker"</td></tr><tr><td>"你好"</td></tr><tr><td>"\alpha"</td></tr><tr><td>"\&nbsp;"</td></tr><tr><td>"86"</td></tr><tr><td>"'\ue108' '\ue411'"</td></tr></table>|<table border="1"><tr><th>transactionName: </th></tr><tr><td>"Eren Joker"</td></tr><tr><td>"你好"</td></tr><tr><td>"\alpha"</td></tr><tr><td>"\&nbsp;"</td></tr><tr><td>"86"</td></tr><tr><td>"'\ue108' '\ue411'"</td></tr></table>|2|
|**[TS-Transaction 7-2]**|**[Validation Test]:**<br>Test setting transaction name to string longer than 25 characters|<table border="1"><tr><th>transactionName: </th></tr><tr><td>"123456789abcdefghijklmnopqrst"</td></tr><tr><td>"What have you done? Eren! You killed all people! No, just 80%. Thank you, Eren."</td></tr></table>|<table border="1"><tr><th>transactionName: </th></tr><tr><td>"123456789abcdefghijklmnop"</td></tr><tr><td>"What have you done? Eren!"</td></tr></table>|2|
|**[TS-Transaction 7-3]**|**[Defect Test]:**<br>Test setting transaction name to invalid values|<table border="1"><tr><th>transactionName: </th></tr><tr><td>" "</td></tr><tr><td>""</td></tr><tr><td>null</td></tr></table>|Throw `[IllegalArgumentException]`: "The transactionName is invalid."|3|
|**[TS-Transaction 7-4]**|**[Defect Test]:**<br>Test setting transaction name twice|<table border="1"><tr><th>transactionName: </th></tr><tr><td>"Eren Joker"</td></tr></table>|Throw `[UnsupportedOperationException]`: "Transaction name cannot be repeatedly set."|3|
|**[TS-Transaction 8-1]**|**[Defect Test]:**<br>Test value set to be null| <table border="1"><tr><th>setTransactionValue</th></tr><tr><td>null</td></tr></table> |<table border="1"><tr><th>setTransactionValue</th></tr><tr><td>`[NullPointerException]`:"The value cannot be null"</td></tr></table> |3|
|**[TS-Transaction 8-2]**|**[Defect Test]:**<br>Test value set to contain invalid characters|<table border="1"><tr><th >setTransactionValue</th></tr><tr><td>"123hello"</td></tr><tr><td>"test"</td></tr><tr><td>" "</td></tr><tr></table>|<table border="1"><tr><th>setTransactionValue</th></tr><tr><td>`[NumberFormatException]`:to be thrown</td></tr></table>|3|
|**[TS-Transaction 8-3]**|**[Defect Test]:**<br>Test non-positive value number |<table border="1"><tr><th >setTransactionValue</th></tr><tr><td>"-0e2"</td></tr><tr><td>""0e2"</td></tr><tr><td>"0e14"</td></tr><tr><td>"-0.0"--"-0.0000000000000000"</td></tr><tr><td>"0000"</td></tr><tr><td>"+0"</td></tr><tr><td>"-0"</td></tr><tr><td>"+.0"</td></tr><tr><td>"-.0"</td></tr><tr></tr><tr><td>"-214414123471.17649173641"</td></tr><tr><td>"-1.0"</td></tr><tr><td>"-209.00"</td></tr><tr><td>"-1.23E10"</td></tr><tr><td>"-0.1"--"-0.0000000000000001"</td></tr><tr></table>|<table border="1"><tr><th>setTransactionValue</th></tr><tr><td>`[IllegalArgumentException]`:"The value should be a positive number, the set fails"</td></tr></table> |3|
|**[TS-Transaction 8-4]**|**[Validation Test]:**<br>Test to set the positive number once with default constructor| <table border="1"><tr><th >setTransactionValue</th></tr><tr><td>"1e+3"</td></tr><tr><td>"1e3"</td></tr><tr><td>"1.E+3"</td></tr><tr><td>"1.25e+3"</td></tr><tr><td>"0.1"-"0.0000000000000001"</td></tr><tr></tr><tr><td>"2147483647.000002"</td></tr><tr><td>"9812457361.34653734"</td></tr><tr><td>"1.00"</td></tr><tr><td>"20.01"</td></tr></table> | <table border="1"><tr><th>setTransactionValue</th></tr><tr><td>The test pass</td></tr></table>|2|
|**[TS-Transaction 8-5]**|**[Defect Test]:**<br> Set value twice with both default constructor and main constructor|<table border="1"><tr><th>setTransactionValue</th></tr><tr><td>setTransactionValue(new BigDecimal("900.00"))</td></tr></table> |<table border="1"><tr><th>setTransactionValue</th></tr><tr><td>`[UnsupportedOperationException]`:"The value cannot be set twice"</td></tr></table>|5|
|**[TS-Transaction 9-1]**|**[Validation Test]:**<br> Test set transaction category with value greater than zero|<table border="1"><tr><th>setTransactionCategory</th></tr><tr><td>1</td></tr><tr><td>50</td></tr><tr><td>100</td></tr></table>|<table border="1"><tr><th>Transaction Category</th></tr><tr><td>1</td></tr><tr><td>50</td></tr><tr><td>100</td></tr></table>|2|
|**[TS-Transaction 9-2]**|**[Defect Test]:**<br>Test set transaction category with value less than or equal to zero|<table border="1"><tr><th>setTransactionCategory</th></tr><tr><td>0</td></tr><tr><td>-25</td></tr><tr><td>-50</td></tr><tr><td>-100</td></tr></table>|Throw `[IllegalArgumentException]:` <br>"Transaction category should greater than zero."|4|
|**[TS-Transaction 10-1]**|**[Validation Test]:**<br>Test the isComplete with default constructor|<table border="1"><tr><th>isComplete</th></tr><tr><td>-</td></tr></table>|<table border="1"><tr><th>isComplete</th></tr><tr><td>4</td></tr></table>|3|
|**[TS-Transaction 10-2]**|**[Validation Test]:**<br>Test the isComplete with main constructor by maually setting transactionName/transactionValue to null| <table border="1"><tr><th>transactionName</th><th>transactionName</th></tr><tr><td> "Tester"</td><td>"980.98"</td></tr><tr><td> null</td><td> "980.98"</td></tr><tr><td> "Tester"</td><td>  null</td></tr></table>|<table border="1"><tr><th>isComplete</th></tr><tr><td>1</td></tr><tr><td>3</td></tr><tr><td>2</td></tr></table>|4|
|**[TS-Transaction 11-1]**|**[Defect Test]:**<br>Test when value is negative number, value is null.<br>**[Validation Test]:**<br>Test the toString maually.|<table border="1"><tr><th>transactionName</th><th>transactionValue</th></tr><tr><td>"Yingxiao Huo"</td><td>100</td></tr><tr><td>"Yicun Duan"</td><td>9999999</td></tr><tr><td>"Zixiang Hu"</td><td>-123123</td></tr><tr><td>"Boon Giin Lee"</td><td>0</td></tr><tr><td>null</td><td>1</td></tr><tr><td>Bob</td><td>null</td></tr></table>|<table border="1"><th>toString</th><tr><td>"Yingxiao Huo - ¥100 Date: [CURRENT DATE]"</td></tr><tr><td>"Yicun Duan - ¥9999999 Date: [CURRENT DATE]"</td></tr><tr><td>"Value can not be negative number"</td></tr><tr><td>"Boon Giin Lee - ¥0 Date: [CURRENT DATE]"</td></tr><tr><td>"Unknown Name - ¥1 Date: [CURRENT DATE]"</td></tr><tr><td>"Bob - ¥Uknown value Date: [CURRENT DATE]"</td></tr> </table>|4|


### **Test Log**

|Test ID|Attempt-1|Modification|Attempt-2|Modification|Attempt-3|Modification|
|---|---|---|---|---|---|---|
|**[TS-Transaction 1-1]**|**[Result]:** <br>`Fail`<br>**[Reason for Failure]:**<br>transactionName and transactionTime did not generate as expected<br> **[Time]**:2021/04/18 16:54<br>**[Tester]**:Leshan Tan (sqylt2) <br>**[Platform]**: MacOS-IDEA<br>![](testLog/TS-Transaction-1-1.png)| **[Modifier]**: `Leshan Tan (sqylt2)`<br> **[Content (M)]**:<br> ***Before***: `transactionName = null;`<br>`transactionTime = null;`<br> ***After***: `transactionName = "[Pending Transaction]";`<br>`transactionTime = new Date();`|**[Result]**: Pass <br> **[Time]**: 2021/04/22 18:12<br> **[Tester]**: Leshan Tan (sqylt2)<br> **[Platform]**: MacOS-IDEA<br> |-|**[Result]**: `Pass` <br> **[Time]**: 2021/04/26 9:05<br> **[Tester]**: Leshan Tan (sqylt2)<br> **[Platform]**: MacOS-IDEA|-|-|
|**[TS-Transaction 2-1]**|**[Result]:**<br>`Pass`<br>**[Time]:**<br>2021/4/18<br>14:06<br>**[Tester]:**<br>Zixiang Hu<br>(scyzh6)<br>**[Platform]:**<br>Windows10-IDEA|-|**[Result]:**<br>`Pass`<br>**[Time]:**<br>2021/4/28<br>16:28<br>**[Tester]:**<br>Zixiang Hu<br>(scyzh6)<br>**[Platform]:**<br>Windows10-IDEA|||
|**[TS-Transaction 2-2]**|**[Result]:**<br>`Pass`<br>**[Time]:**<br>2021/4/18<br>14:06<br>**[Tester]:**<br>Zixiang Hu<br>(scyzh6)<br>**[Platform]:**<br>Windows10-IDEA|-|**[Result]:**<br>`Pass`<br>**[Time]:**<br>2021/4/25<br>14:36<br>**[Tester]:**<br>Zixiang Hu<br>(scyzh6)<br>**[Platform]:**<br>Windows10-IDEA||**[Result]:**<br>`Pass`<br>**[Time]:**<br>2021/4/29<br>08:00<br>**[Tester]:**<br>Zixiang Hu<br>(scyzh6)<br>**[Platform]:**<br>Windows10-IDEA|
|**[TS-Transaction 2-3]**|**[Result]:**<br>`Fail`<br>**[Reason for failure]:**<br>The source code do not support throw this specific exception yet. <br>**[Time]:**<br>2021/4/18<br>14:06<br>**[Tester]:**<br>Zixiang Hu<br>(scyzh6)<br>**[Platform]:**<br>Windows10-IDEA ![](testLog/TS-Transaction-2-1.png)|**[Modifier]:**<br> Zixiang Hu (scyzh6)<br> **[Content (A)]**:<br> ***After***:<br>![](fix/TS-Trans-2-3-after.png)|**[Result]:**<br>`Pass`<br>**[Time]:**<br>2021/4/21<br>22:04<br>**[Tester]:**<br>Zixiang Hu<br>(scyzh6)<br>**[Platform]:**<br>Windows10-IDEA|||
|**[TS-Transaction 2-4]**|**[Result]:**<br>`Fail`<br>**[Reason for failure]:**<br>The source code do not support throw this specific exception yet.<br>**[Time]:**<br>2021/4/18<br>14:06<br>**[Tester]:**<br>Zixiang Hu<br>(scyzh6)<br>**[Platform]:**<br>Windows10-IDEA ![](testLog/TS-Transaction-2-1.png)|**[Modifier]:**<br> Zixiang Hu (scyzh6)<br> **[Content (A)]**:<br> ***After***:<br>![](fix/TS-Trans-2-4-after.png)|**[Result]:**<br>`Pass`<br>**[Time]:**<br>2021/4/21<br>22:04<br>**[Tester]:**<br>Zixiang Hu<br>(scyzh6)<br>**[Platform]:**<br>Windows10-IDEA|||
|**[TS-Transaction 2-5]**|**[Result]:**<br>`Fail`<br>**[Reason for failure]:**<br>The source code do not support throw this specific exception yet.<br>**[Time]:**<br>2021/4/18<br>14:06<br>**[Tester]:**<br>Zixiang Hu<br>(scyzh6)<br>**[Platform]:**<br>Windows10-IDEA ![](testLog/TS-Transaction-2-1.png)|**[Modifier]:**<br> Zixiang Hu (scyzh6)<br> **[Content (A)]**:<br>***After***:<br>![](fix/TS-Trans-2-5-after.png)|**[Result]:**<br>`Pass`<br>**[Time]:**<br>2021/4/21<br>22:04<br>**[Tester]:**<br>Zixiang Hu<br>(scyzh6)<br>**[Platform]:**<br>Windows10-IDEA|||
|**[TS-Transaction 2-6]**|**[Result]:**<br>`Fail`<br>**[Reason for failure]:**<br>The source code do not support throw this specific exception yet.<br>**[Time]:**<br>2021/4/18<br>14:06<br>**[Tester]:**<br>Zixiang Hu<br>(scyzh6)<br>**[Platform]:**<br>Windows10-IDEA ![](testLog/TS-Transaction-2-1.png)|**[Modifier]:**<br> Zixiang Hu (scyzh6)<br> **[Content (A)]**:<br> ***After***:<br>![](fix/TS-Trans-2-6-after.png)|**[Result]:**<br>`Pass`<br>**[Time]:**<br>2021/4/21<br>22:04<br>**[Tester]:**<br>Zixiang Hu<br>(scyzh6)<br>**[Platform]:**<br>Windows10-IDEA|||
|**[TS-Transaction 2-7]**|**[Result]:**<br>`Fail`<br>**[Reason for failure]:**<br>The source code do not support throw this specific exception yet.<br>**[Time]:**<br>2021/4/18<br>14:06<br>**[Tester]:**<br>Zixiang Hu<br>(scyzh6)<br>**[Platform]:**<br>Windows10-IDEA ![](testLog/TS-Transaction-2-1.png)|**[Modifier]:**<br> Zixiang Hu (scyzh6)<br> **[Content (A)]**:<br> ***After***:<br>![](fix/TS-Trans-2-7-after.png)|**[Result]:**<br>`Pass`<br>**[Time]:**<br>2021/4/21<br>22:04<br>**[Tester]:**<br>Zixiang Hu<br>(scyzh6)<br>**[Platform]:**<br>Windows10-IDEA|||
|**[TS-Transaction 3-1]**|**[Result]:**<br>Pass<br>**[Time]:**<br>2021/04/21<br>22:24<br>**[Tester]:**<br>Yingxiao Huo<br>(scyyh9)<br>**[Platform]:**<br>Windows10-IDEA|||||
|**[TS-Transaction 3-2]**|**[Result]:**<br>Fail<br>**[Reason for Failure]:**<br>When input is null, program can not report an error.<br>**[Time]:**<br>2021/04/21<br>22:30<br>**[Tester]:**<br>Yingxiao Huo<br>(scyyh9)<br>**[Platform]:**<br>Windows10-IDEA<br>![](testLog/TS-Transaction-3-1.png)|**[Modifier]**<br>Yingxiao Huo(scyyh9)<br>**[Content(A)]:**<br>`if(transactionName == null;){`<br>`throw new IllegalArgumentException("Name is not set");}`<br>`else if(name.length() > 25){`<br>`throw new IllegalArgumentException("Name can not be longer than 25 characters.");}` |**[Result]:**<br>Pass<br>**[Time]:**<br>2021/04/21<br>22:34<br>**[Tester]:**<br>Yingxiao Huo<br>(scyyh9)<br>**[Platform]:**<br>Windows10-IDEA|||
|**[TS-Transaction 4-1]**|**[Result]:**<br> `Fail`<br> **[Time]:**<br>2021/04/18 17:24<br>**[Tester]:**<br>Leshan Tan (sqylt2) <br>**[Platform]**: MacOS-IDEA|**[Modifier]:**<br> Leshan Tan (sqylt2) <br> **[Content (M)]:**<br> ***Before***: ![transactionValue_before](fix/Fix_transactionValue_code_before.png) ***After***: ![transactionValue_after](fix/Fix_transactionValue_code_after.png)|**[Result]:** Pass<br> **[Time]**:2021/04/29 2:33<br>**[Tester]**:Leshan Tan (sqylt2) <br>**[Platform]**: MacOS-IDEA|-|-|-||
|**[TS-Transaction 5-1]**|**[Result]:**<br>`Pass`<br>**[Time]:**<br>2021/4/18<br>21:15<br>**[Tester]:**<br>Ziyi Wang<br>(scyzw10)<br>**[Platform]:**<br>Windows10-IDEA|-|**[Result]:**<br>`Pass`<br>**[Time]:**<br>2021/4/24<br>21:55<br>**[Tester]:**<br>Ziyi Wang<br>(scyzw10)<br>**[Platform]:**<br>Windows10-IDEA|-|**[Result]:**<br>`Pass`<br>**[Time]:**<br>2021/4/29<br>08:02<br>**[Tester]:**<br>Ziyi Wang<br>(scyzw10)<br>**[Platform]:**<br>Windows10-IDEA|
|**[TS-Transaction 6-1]**|**[Result]:** <br>`pass`<br>**[Time]:**<br>2021/4/21 22:33<br>**[Tester]:**<br>Zixiang Hu(scyzh6)<br>**[Platform]:**<br>Windows10-IDEA| | **[Result]:** <br>`pass`<br>**[Time]:**<br>2021/4/25 23:46<br>**[Tester]:**<br>Zixiang Hu(scyzh6)<br>**[Platform]:**<br>Windows10-IDEA|||
|**[TS-Transaction 7-1]**|**[Result]:** <br>`Pass` <br> **[Time]:**<br>2021/04/18 22:00<br>**[Tester]:**<br>Yicun Duan(scyyd3) **[Platform]**: Ubuntu-IDEA|-|**[Result]:** `Pass` **[Time]:**<br>2021/04/19 23:51<br>**[Tester]:**<br>Yicun Duan(scyyd3) <br>**[Platform]**: Ubuntu-IDEA|-|**[Result]:** `Pass` **[Time]:**<br>2021/04/20 22:00<br>**[Tester]:**<br>Yicun Duan(scyyd3) **[Platform]**: Ubuntu-IDEA|-|
|**[TS-Transaction 7-2]**|**[Result]:** `Fail` <br> **[Reason for Failure]:**<br> The program cannot truncate the string longer than 25 characters. <br> **[Time]:**<br>2021/04/18 22:00<br>**[Tester]:**<br>Yicun Duan(scyyd3) **[Platform]**: Ubuntu-IDEA|**[Modifier]:**<br> Yicun Duan(scyyd3) <br> **[Content (A)]:**<br> `if (tName.length() > 25)` <br> `{` <br>` tName = tName.substring(0, 25);` <br> `}` |**[Result]:** `Pass` **[Time]:**<br>2021/04/19 23:51<br>**[Tester]:**<br>Yicun Duan(scyyd3) **[Platform]**: Ubuntu-IDEA|-|**[Result]:** `Pass` **[Time]:**<br>2021/04/20 22:00<br>**[Tester]:**<br>Yicun Duan(scyyd3) **[Platform]**: Ubuntu-IDEA|-|
|**[TS-Transaction 7-3]**|**[Result]:** `Fail`<br> **[Reason for Failure]:**<br> The program cannot throw out an exception when the input string is empty or null. <br>**[Time]:**<br>2021/04/18 22:00<br>**[Tester]:**<br>Yicun Duan(scyyd3) **[Platform]**: Ubuntu-IDEA| **[Modifier]:**<br> Yicun Duan(scyyd3) <br> **[Content (A)]:**<br> `if (tName == null or tName.isBlank())`<br> `{` <br>`throw new IllegalArgumentException("The transactionName is invalid.");` <br> `}` |**[Result]:** `Pass` **[Time]:**<br>2021/04/19 23:51<br>**[Tester]:**<br>Yicun Duan(scyyd3) **[Platform]**: Ubuntu-IDEA|-|**[Result]:** `Pass` **[Time]:**<br>2021/04/20 22:00<br>**[Tester]:**<br>Yicun Duan(scyyd3) **[Platform]**: Ubuntu-IDEA|-|
|**[TS-Transaction 7-4]**|**[Result]:** `Fail`<br> **[Reason for Failure]:** <br>The program cannot throw out an exception when the transaction name is set twice.<br> **[Time]:**<br>2021/04/18 22:00<br>**[Tester]:**<br>Yicun Duan(scyyd3) **[Platform]**: Ubuntu-IDEA| **[Modifier]:**<br> Yicun Duan(scyyd3) <br> **[Content (A)]:**<br> `if (!transactionName.equals(null))` <br> `{` <br>`throw new UnsupportedOperationException("Transaction name cannot be repeatedly set.");` <br>`}` |**[Result]:** `Fail` <br> **[Reason for Failure]:** <br>The previous fix didn't consider the outcome of default constructor, the transaction name is defaultly set to "[Pending Transaction]"<br>**[Time]:**<br>2021/04/19 23:51<br>**[Tester]:**<br>Yicun Duan(scyyd3) **[Platform]**: Ubuntu-IDEA|**[Modifier]:**<br> Yicun Duan(scyyd3) <br> **[Content (M)]:**<br> ***Before:***<br>`if (!transactionName.equals(null))` <br> `{` <br>`throw new UnsupportedOperationException("Transaction name cannot be repeatedly set.");` <br>`}` <br>***After:*** <br>`if (!transactionName.equals("[Pending Transaction]"))` <br> `{` <br>`throw new UnsupportedOperationException("Transaction name cannot be repeatedly set.");` <br>`}`|**[Result]:** `Pass`<br> **[Time]:**<br>2021/04/20 22:00<br>**[Tester]:**<br>Yicun Duan(scyyd3) **[Platform]**: Ubuntu-IDEA|-|
|**[TS-Transaction 8-1]**|**[Result]:** `Fail`<br>**[Reason For Failure]:** No `[NullPointerException]` thrown <br> **[Time]:**<br>2021/04/19 14:13<br>**[Tester]:**<br>Lin Chen (biylc2) **[Platform]**: Windows10-IDEA| **[Modifier]:**<br> Lin Chen <br> **[Content (A)]:**<br> `if (tValue== null) {throw new NullPointerException("The value cannot be null.");}` <br> | **[Result]:** `Pass` **[Time]:**<br>2021/04/24 14:37<br>**[Tester]:**<br>Lin Chen (biylc2) **[Platform]**: Windows10-IDEA|-| **[Result]:** `Pass` **[Time]:**<br>2021/04/24 15:46<br>**[Tester]:**<br>Lin Chen (biylc2) **[Platform]**: Windows10-IDEA|-|
|**[TS-Transaction 8-2]**|**[Result]:** `Pass` **[Time]:**<br>2021/04/19 14:13<br>**[Tester]:**<br>Lin Chen (biylc2) **[Platform]**: Windows10-IDEA|-| **[Result]:** `Pass` **[Time]:**<br>2021/04/24 14:37<br>**[Tester]:**<br>Lin Chen (biylc2) **[Platform]**: Windows10-IDEA|-| **[Result]:** `Pass` **[Time]:**<br>2021/04/24 15:46<br>**[Tester]:**<br>Lin Chen (biylc2) **[Platform]**: Windows10-IDEA|-|
|**[TS-Transaction 8-3]**|**[Result]:** `Fail`<br> **[Reason For Failure]:** No `[IllegalArgumentException]` thrown <br> **[Time]:**<br>2021/04/19 14:13<br>**[Tester]:**<br>Lin Chen (biylc2) **[Platform]**: Windows10-IDEA|**[Modifier]:**<br> Lin Chen (biylc2) <br> **[Content (A)]:**<br>`if (tValue== null) {throw new NullPointerException("The value cannot be null.");}`<br> | **[Result]:** `Pass` **[Time]:**<br>2021/04/24 14:37<br>**[Tester]:**<br>Lin Chen (biylc2) **[Platform]**: Windows10-IDEA|-| **[Result]:** `Pass` **[Time]:**<br>2021/04/24 15:46<br>**[Tester]:**<br>Lin Chen (biylc2) **[Platform]**: Windows10-IDEA|-|
|**[TS-Transaction 8-4]**|**[Result]:** `Pass` **[Time]:**<br>2021/04/19 14:13<br>**[Tester]:**<br>Lin Chen (biylc2) **[Platform]**: Windows10-IDEA|**[Modifier]:**<br> Lin Chen (biylc2) <br> **[Content (M)]:** <br> ***Before:*** ![](fix/Fix_SetTransVal_4.png)<br> ***After :***![](fix/Fix_SetTransVal_4_1.png)<br> |**[Result]:** `Pass` **[Time]:**<br>2021/04/24 14:37<br>**[Tester]:**<br>Lin Chen (biylc2) **[Platform]**: Windows10-IDEA|-| **[Result]:** `Pass` **[Time]:**<br>2021/04/24 15:46<br>**[Tester]:**<br>Lin Chen (biylc2) **[Platform]**: Windows10-IDEA|-|
|**[TS-Transaction 8-5]**|**[Result]:** `Fail`<br> **[Reason For Failure]:** No `[UnsupportedOperationException]` thrown <br> **[Time]:**<br>2021/04/19 14:13<br>**[Tester]:**<br>Lin Chen (biylc2) **[Platform]**: Windows10-IDEA|**[Modifier]:**<br> Lin Chen (biylc2) <br> **[Content (A)]:**<br>`else if (isComplete()==true or isComplete()==false) {throw new UnsupportedOperationException("The value cannot be set twice");}`<br> |`[Due to the change of isComplete]`<br><br> **[Result]:** `Fail` **[Time]:**<br>2021/04/24 14:37<br>**[Tester]:**<br>Lin Chen (biylc2) **[Platform]**: Windows10-IDEA|**[Modifier]:** <br> Lin Chen (biylc2) <br> **[Content (M)]:**<br> ***Before:*** <br>`else if (isComplete()==true or isComplete()==false) {throw new UnsupportedOperationException("The value cannot be set twice");}`<br> ***After :*** <br>`else if (isComplete()==1 or isComplete()==3){throw new UnsupportedOperationException("The value cannot be set twice");} `<br>|**[Result]:** `Pass` **[Time]:**<br>2021/04/ 15:46<br>**[Tester]:**<br>Lin Chen (biylc2) **[Platform]**: Windows10-IDEA|-|
|**[TS-Transaction 9-1]**|**[Result]:** `Fail` **[Time]:**<br>2021/4/18 21:48<br>**[Tester]:**<br>Zixiang Hu(scyzh6)<br> **[Platform]:** Windows-IDEA<br> ![](testLog/TS-Transaction-9-1.png)|**[Modifier]:**<br>Zixiang Hu(scyzh6)<br>**[Content(M)]:**<br>**before:**<br>`transactionCategory = tCat;`<br>**after:**<br>`if(tCat >= 0){`<br>`transactionCategory = tCat;`<br>`} else {`<br>`throw new IllegalArgumentException("Transaction category should greater than zero.");}`|**[Result]:**<br>`Pass`<br>**[Time]:**<br>2021/4/25 19:01<br>**[Tester]:**<br>Zixiang Hu(scyzh6)<br>**[Platform]:**<br>Windows10-IDEA|||
|**[TS-Transaction 10-1]**|**[Result]:** `Pass` **[Time]:**<br>2021/04/19 14:37<br>**[Tester]:**<br>Lin Chen (biylc2) **[Platform]**: Windows10-IDEA|-|`[Change the return type of isComplete()]`<br><br> **[Result]:** `Pass` **[Time]:**<br>2021/04/24 14:37<br>**[Tester]:**<br>Lin Chen (biylc2) **[Platform]**: Windows10-IDEA|**[Modifier]:** <br> Lin Chen (biylc2) <br> **[Content (M)]:**<br> ***Before:*** <br>![](fix/Fix_isComplete_v1.png)`<br> ***After :*** <br>![](fix/Fix_isComplete.png) |**[Result]:** `Pass` **[Time]:**<br>2021/04/ 15:46<br>**[Tester]:**<br>Lin Chen (biylc2) **[Platform]**: Windows10-IDEA|
|**[TS-Transaction 10-2]**|**[Result]:** `Pass` **[Time]:**<br>2021/04/24 14:37<br>**[Tester]:**<br>Lin Chen (biylc2) **[Platform]**: Windows10-IDEA|-|`[Change the return type of isComplete()]`<br><br>**[Result]:** `Pass` **[Time]:**<br>2021/04/24 14:37<br>**[Tester]:**<br>Lin Chen (biylc2) **[Platform]**: Windows10-IDEA|**[Modifier]:** <br> Lin Chen (biylc2) <br> **[Content (M)]:**<br> ***Before:*** <br>![](fix/Fix_isComplete_v1.png)`<br> ***After :*** <br>![](fix/Fix_isComplete.png)|**[Result]:** `Pass` **[Time]:**<br>2021/04/ 15:46<br>**[Tester]:**<br>Lin Chen (biylc2) **[Platform]**: Windows10-IDEA|
|**[TS-Transaction 11-1]**|**[Result]:**<br>`Fail`<br>**[Reason for Failure]:** <br>When name is null or value is negtive, program can not report an error<br>**[Time]:**<br>2021/04/21<br>16:44<br>**[Tester]:**<br>Yingxiao Huo<br>(scyyh9)<br>**[Platform]:**<br>Windows10-IDEA<br>![](testLog/TS-Transaction-11-2.png)|**[Modifier]**<br>Yingxiao Huo(scyyh9)<br>**[Content(A)]:**<br>`if (transactionName == null){`<br>`throw new IllegalException("Name is not set.");}`<br>`if (transactionValue.compareTo(new BigDecimal("0.00")) == -1){`<br>`throw new IllegalArgumentException("Value can not be negative number");}`|**[Result]:**<br>`Fail`<br>**[Time]:**<br>2021/04/21<br>16:57<br>**[Tester]:**<br>Yingxiao Huo<br>(scyyh9)<br>**[Platform]:**<br>Windows10-IDEA|**[Modifier]**<br>Yingxiao Huo(scyyh9)<br>**[Content(M)]:**<br>***Before:*** <br>`return transactionName + " - ¥" + transactionValue.toString();`<br> ***After:*** <br> `return transactionName + " - ¥" + transactionValue.toString() + " Date: " + transactionTime;`|**[Result]:**<br>`Pass` <br> **[Reason for Failure]:** <br>Program can not print date.<br>**[Time]:**<br>2021/04/27<br>21:17<br>**[Tester]:**<br>Yingxiao Huo<br>(scyyh9)<br>**[Platform]:**<br>Windows10-IDEA||


### *Class:* `BoCCategory`

### **Test Plan**
`Test Schedule:` <br>
***"Write test script for BoC Category Class"***<br>
***"Fix script for BoC Transaction Class && BoC Category Class"***

|Test ID|Type|Inputs|Expected Outcome|Importance|
|----|---------|------|----------------|-------|
|**[TS-Category 1-1]**|**[Validation Test]:**<br>Test constructor with no parameters|-|<table border="1"><tr><td>CategoryName = "Unknown" // if is the first instance </td></tr><tr><td>CategoryName = "New Category" + categoryNum // otherwise</td></tr><tr><td>CategoryBudget == new BigDecimal("0.00")</td></tr><tr><td>CategorySpend == new BigDecimal("0.00")</td></tr></table>|4|
|**[TS-Category 2-1]**|**[Validation Test]:**<br>Test to see the CategoryName, CategoryBudget and CategorySpend set correctly.|<table border="1"><tr><th>cName</th></tr><tr><td>"test1"</td></tr><tr><td>"test2" </td></tr><td>"test3" </td></tr></table>|<table border="1"> <tr><th>CategoryName</th><th>CategoryBudget</th><th>CategorySpend</th></tr><tr><td>"test1"</td><td>new BigDecimal("0.00")</td><td>new BigDecimal("0.00")</td></tr><tr><td>"test2"</td><td>new BigDecimal("0.00")</td><td>new BigDecimal("0.00")</td></tr><tr><td>"test3"</td><td>new BigDecimal("0.00")</td><td>new BigDecimal("0.00")</td></tr></table>|4|
|**[TS-Category 2-2]**|**[Defect Test]:**<br>Category Name at most 15 characters.|<table border="1"><tr><th>cName</th></tr><tr><tr><td>"testWithMoreThan15Chars" </td></tr></table>|Throw an exception containsString(*"Category Name at most 15 characters."*)|4|
|**[TS-Category 3-1]**|**[Defect Test]:**<br>set name is null, is longer than 15 characters.|<table border="1"><tr><th>categoryName</th></tr><tr><td>Yingxiao Huo </td></tr><tr><td>Yicun Duan</td></tr><tr><td>Zixiang Hu</td></tr><tr><td>Lin Chen</td></tr><tr><td>Leshan Tan</td></tr><tr><td>Ziyi Wang</td></tr><tr><td>Boon Giin Lee</td></tr><tr><td>^%&^%^</td></tr><tr><td>()*&*%Abc</td></tr><tr><td>12345</td></tr><tr><td>asdddasdasdasdacacwawcacw</td></tr></table> <br/>|<table border="1"><tr><th>categoryName</th></tr><tr><td>Yingxiao Huo </td></tr><tr><td>Yicun Duan</td></tr><tr><td>Zixiang Hu</td></tr><tr><td>Lin Chen</td></tr><tr><td>Leshan Tan</td></tr><tr><td>Ziyi Wang</td></tr><tr><td>Boon Giin Lee</td></tr><tr><td>^%&^%^</td></tr><tr><td>()*&*%Abc</td></tr><tr><td>12345</td></tr><tr><td>Category name can not longer than 15 characters.</td></tr></table> <br/>|4|
|**[TS-Category 4-1]**|**[Validation Test]:**<br>Test whether the returned budget is expected |<table border="1"><tr><th>CategoryBudget: </th></tr><tr><td>BigDecimal("100")</td></tr><tr><td>BigDecimal("100000000000")</td></tr><tr><td>BigDecimal("7.77E+10")</td></tr><tr><td>BigDecimal("456e-9")</td></tr><tr><td>BigDecimal("01010101000")</td></tr><tr><td>BigDecimal("314.15926")</td></tr></table> |<table border="1"><tr><th>CategoryBudget: </th></tr><tr><td>BigDecimal("100")</td></tr><tr><td>BigDecimal("100000000000")</td></tr><tr><td>BigDecimal("7.77E+10")</td></tr><tr><td>BigDecimal("456e-9")</td></tr><tr><td>BigDecimal("01010101000")</td></tr><tr><td>BigDecimal("314.15926")</td></tr></table>|4|
|**[TS-Category 4-2]**|**[Validation Test]:**<br>Test whether the returned budget is in correct type and format | <table border="1"><tr><th>getCategoryBudget</th></tr><tr><td>BigDecimal("0.00")</td></tr></table> |<table border="1"><tr><th>getCategoryBudget</th></tr><tr><td>BigDecimal("0.00")</td></tr></table>|3|
|**[TS-Category 5-1]**|**[Validation Test]:**<br> Test categorySpend() with default constructor|<table border="1"><tr><th>CategorySpend</th></tr><tr><td>-</td></tr></table>|<table border="1"><tr><th>CategorySpend</th></tr><tr><td>CategorySpend == new BigDecimal("0.00")</td></tr></table>|3|
|**[TS-Category 5-2]**|**[Validation Test]:**<br> Test categorySpend() with input parameters source|<table border="1"><tr><th>CategorySpend: </th></tr><tr><td>BigDecimal("0")</td></tr><tr><td>BigDecimal("0.000")</td></tr><tr><td>BigDecimal("1")</td></tr><tr><td>BigDecimal("1.00000")</td></tr><tr><td>BigDecimal("100000")</td></tr><tr><td>BigDecimal("100000.00000")</td></tr><tr><td>BigDecimal("999999999999999")</td></tr><tr><td>BigDecimal("999999999999999.999999999999999")</td></tr><tr><td>BigDecimal("0001010010")</td></tr><tr><td>BigDecimal("3.1415926535E+8")</td></tr><tr><td>BigDecimal("3.1415926535E-8")</td></tr></table>|<table border="1"><tr><th>CategorySpend: </th></tr><tr><td>BigDecimal("0")</td></tr><tr><td>BigDecimal("0.000")</td></tr><tr><td>BigDecimal("1")</td></tr><tr><td>BigDecimal("1.00000")</td></tr><tr><td>BigDecimal("100000")</td></tr><tr><td>BigDecimal("100000.00000")</td></tr><tr><td>BigDecimal("999999999999999")</td></tr><tr><td>BigDecimal("999999999999999.999999999999999")</td></tr><tr><td>BigDecimal("0001010010")</td></tr><tr><td>BigDecimal("3.1415926535E+8")</td></tr><tr><td>BigDecimal("3.1415926535E-8")</td></tr></table>|4|
|**[TS-Category 6-1]**|**[Defect Test]:**<br>Test when name is null, is longer than 15 character, is special characters.|<table border="1"><tr><th>categoryName</th></tr><tr><td>Yingxiao Huo </td></tr><tr><td>Yicun Duan</td></tr><tr><td>Zixiang Hu</td></tr><tr><td>Lin Chen</td></tr><tr><td>Leshan Tan</td></tr><tr><td>Ziyi Wang</td></tr><tr><td>Boon Giin Lee</td></tr><tr><td>//awdaw</td></tr><tr><td>^$^$^&%</td></tr><tr><td>asdsadadwadawdasdascsgrsrgdrsgdgg</td></tr><tr><td>null</td></tr></table> <br/>|<table border="1"><tr><th>categoryName</th></tr><tr><td>Yingxiao Huo </td></tr><tr><td>Yicun Duan</td></tr><tr><td>Zixiang Hu</td></tr><tr><td>Lin Chen</td></tr><tr><td>Leshan Tan</td></tr><tr><td>Ziyi Wang</td></tr><tr><td>Boon Giin Lee</td></tr><tr><td>//awdaw</td></tr><tr><td>^$^$^&%</td></tr><tr><td>asdsadadwadawda</td></tr><tr><td>name can not be null</td></tr></table> <br/>|4|
|**[TS-Category 7-1]**|**[Validation Test]**:<br>Test whether the method could take a **Float** parameter|<table border="1"><tr><th>input(Attempt1)</th><th>input(Attempt2)</th></tr><tr><td rowspan = "16">20.00F</td></tr><tr><td> 0.1</td></tr><tr><td> 0.01</td></tr><tr><td>7.0</td></tr><tr><td>30.0</td></tr><tr><td>100.0</td></tr><tr><td>200.0</td></tr><tr><td>10000.0</td></tr><tr><td>10000000.0</td></tr><tr><td>-1.0</td></tr><tr><td>-3.0</td></tr><tr><td>-10.0</td></tr><tr><td>-100.0</td></tr><tr><td>-1000.0</td></tr></table>|<table border="1"><tr><th>Attempt1</th><th>CategorySpend(Attempt2)</th></tr><tr><td rowspan = "16">could not compile</td></tr><tr><td> 0.1</td></tr><tr><td> 0.01</td></tr><tr><td>7.0</td></tr><tr><td>30.0</td></tr><tr><td>100.0</td></tr><tr><td>200.0</td></tr><tr><td>10000.0</td></tr><tr><td>10000000.0</td></tr><tr><td>0.0</td></tr><tr><td>0.0</td></tr><tr><td>0.0</td></tr><tr><td>0.0</td></tr><tr><td>0.0</td></tr></table>|5|
|**[TS-Category 8-1]**|**[Defect Test]:**<br>Test add value set to be null |<table border="1"><tr><th>addExpense</th></tr><tr><td>null</td></tr></table> |<table border="1"><tr><th>addExpense</th></tr><tr><td>`[NullPointerException]`:"Illegal input"</td></tr></table>|3|
|**[TS-Category 8-2]**|**[Defect Test]:**<br>Test add value set to be negative number|<table border="1"><tr><th>addExpense</th></tr><tr><td>"-2e12"</td></tr><tr><td>"-2.134"</td></tr></table>|<table border="1"><tr><th>addExpense</th></tr><tr><td>`[IllegalArgumentException]`:"Illegal input"</td></tr></table>|3|
|**[TS-Category 8-3]**|**[Validation Test]:**<br>Test add value set to be positive number |<table border="1"><tr><th>addExpense</th></tr><tr><td>"0.00</td></tr><tr><td>"2.13443343"</td></tr><tr><td>"2e12"</td></tr><tr><td>"2147483647.0012343</td></tr><tr><td>"+.0"</td></tr></table>|<table border="1"><tr><th>addExpense</th></tr><tr><td>"0.00</td></tr><tr><td>"2.13443343"</td></tr><tr><td>"2e12"</td></tr><tr><td>"2147483647.0012343</td></tr><tr><td>"+.0"</td></tr></table> |3|
|**[TS-Category 9-1]**|**[Validation Test]**:<br>Test whether the method could remove the expense correctly|<table border="1"><tr><th>*addExpense*</th><th>*removeExpense*</th></tr><tr><td>"0.0"</td><td>"0.0"</td></tr><tr><td>"1000.0"</td><td>"100.0"</td></tr><tr><td>"1000.0"</td><td>"800.0"</td></tr><tr><td>"1000.0"</td><td>"200.02"</td></tr><tr><td>"1000.0"</td><td>"200.02"</td></tr><tr><td>"1000.0"</td><td>"200.02"</td></tr><tr><td>"1000.0"</td><td>"200.0002"</td></tr><tr><td>"100"</td><td>"0.1"</td></tr><tr><td>"100"</td><td>"0.01"</td></tr><tr><td>"100" </td><td>"0.001"</td></tr><tr><td>"2.0"</td><td>"2.0"</td></tr><tr><td>"3.0"</td><td>"3.0"</td></tr><tr><td>"10.0"</td><td>"10.0"</td></tr><tr><td>"200.0"</td><td>"200.0"</td></tr><tr><td>"10000"</td><td>"1314.1314521"</td></tr><tr><td>"1000000.0000"</td><td>"1000000.0000"</td></tr></table>|<table border="1"><tr><th>*CategorySpend*</th></tr><tr><td>"0.0"</td></tr><tr><td>"900"</td></tr><tr><td>"200"</td></tr><tr><td>"799.98"</td></tr><tr><td>"700"</td></tr><tr><td>"800"</td></tr><tr><td>"799.9998"</td></tr><tr><td>"99.9"</td></tr><tr><td>"99.99"</td></tr><tr><td>"99.999"</td></tr><tr><td>"0"</td></tr><tr><td>"0"</td></tr><tr><td>"0"</td></tr><tr><td>"0" </td></tr><tr><td>"8685.8685479"</td></tr><tr><td>"0"</td></tr></table>|3|
|**[TS-Category 9-2]**|**[Defect Test]:**<br>Test the negative expense|<table border="1"><tr><th>*removeExpense*</th></tr><tr><td>"-20.0"</td></tr><tr><td>"-30.0"</td></tr><tr><td>"-50.0"</td></tr></table>|throw InvalidParameterException("The expense must be >= 0")|3|
|**[TS-Category 9-3]**|**[Defect Test]:**<br>Test the negative CategorySpend|<table border="1"><tr><th>*addExpense*</th><th>*removeExpense*</th></tr><tr><td>"200.0"</td><td>"300.0"</td></tr><tr><td>"200.0"</td><td>"400.0"</td></tr><tr><td>"1000.0"</td><td>"1000.0"</td></tr></table>|throw InvalidParameterException("The CategorySpend is must be >= 0")|4|
|**[TS-Category 10-1]**|**[Validation Test]:**<br>Test with spend number set|<table border="1"><tr><th>resetBudgetSpend</th></tr><tr><td>CategorySpend = new BigDecimal("20000.0292")</td></tr></table>|<table border="1"><tr><th>resetBudgetSpend</th></tr><tr><td> "New Category(¥0.00) - ¥0.00 (¥0.00 Remaining)"</td></tr></table>|3|
|**[TS-Category 11-1]**|**[Validation Test]:**<br>Test whether the returned remaining budget is expected |<table border="1"><tr><th>CategoryBudget: </th><th>CategorySpend: </th></tr><tr><td>BigDecimal("100")</td><td>BigDecimal("99")</td></tr><tr><td>BigDecimal("100000000000")</td><td>BigDecimal("100000000000")</td></tr><tr><td>BigDecimal("3.1415926")</td><td>BigDecimal("4.1415926")</td></tr></table> | <table border="1"><tr><th>RemainingBudget: </th></tr><tr><td>BigDecimal("1")</td></tr><tr><td>BigDecimal("0")</td></tr><tr><td>BigDecimal("-1.0000000")</td></tr></table>|4|
|**[TS-Category 12-1]**|**[Validation Test]:**<br>Test with spend number set|<table border="1"><th>toString</th></tr><tr><td>-</td></tr></table>|<table border="1"><th>toString</th></tr><tr><td>"[New Category1](Budget: ¥0.00) - ¥0.00 (¥0.00 Remaining)"</td></tr></table>|2|
|**[TS-Category 12-2]**|**[Validation Test]:**<br>Test with positive remaining number|<table border="1"><th>toString</th></tr><tr><td>**CategoryBudget :** "3457834.023423" **CategorySpend :** "667433.00564"</td></tr></table>|<table border="1"><th>toString</th></tr><tr><td>"[Positive](Budget: ¥3457834.02) - ¥667433.01 (¥2790401.01 Remaining)"</td></tr></table>|2|
|**[TS-Category 12-3]**|**[Validation Test]:**<br>Test with negative remaining number|<table border="1"><th>toString</th></tr><tr><td>**CategoryBudget :** "10000.0" **CategorySpend :** "20000.0"</td></tr></table>|<table border="1"><th>toString</th></tr><tr><td>""[Negative](Budget: ¥10000.00) - ¥20000.00 (¥10000.00 Overspent)"</td></tr></table>|2|
|**[TS-Category 12-4]**|**[Validation Test]:**<br>Test with unknown category name|<table border="1"><th>toString</th></tr><tr><td>-</td></tr></table>|<table border="1"><th>toString</th></tr><tr><td>"[Unknown](Budget: ¥0.00) - ¥0.00 (¥0.00 Remaining)"</td></tr></table>|2|



### **Test Log**
|Test ID|Attempt-1|Modification|Attempt-2|Modification|Attempt-3|Modification|
|---|---|---|---|---|---|---|
|**[TS-Category 1-1]**|**[Result]:** `Fail`<br> **[Reason for Failure]:**<br>categoryName did not generate as expected<br>**[Time]**:<br>2021/04/21 11:51<br>**[Tester]**:<br>Leshan Tan (sqylt2) <br>**[Platform]**: `MacOS-IDEA`<br>![](testLog/TS-Category-1-1.png)| **[Modifier]**: `Leshan Tan (sqylt2)`<br> **[Content (M)]**:<br> ***Before***: `CategoryName = "New Category"`<br> ***After***: `CategoryName = "Unknown"` or <br>`CategoryName = "New Category" + categoryNum`|**[Result]**: `Pass` <br> **[Time]**: `2021/04/28 19:43`<br> **[Tester]**: `Leshan Tan (sqylt2)`<br> **[Platform]**: `MacOS-IDEA`|-|-|-|
|**[TS-Category 2-1]**|**[Result]:**<br>`Pass`<br>**[Time]:**<br>2021/04/24<br>23:07<br>**[Tester]:**<br>Ziyi Wang<br>(scyzw10)<br>**[Platform]:**<br>Windows10-IDEA<br>![](testLog/TS-Category-2-1.png)|-|**[Result]:**<br>`Pass`<br>**[Time]:**<br>2021/04/26<br>21:47<br>**[Tester]:**<br>Ziyi Wang<br>(scyzw10)<br>**[Platform]:**<br>Windows10-IDEA<br>|-|**[Result]:**<br>`Pass`<br>**[Time]:**<br>2021/04/28<br>23:36<br>**[Tester]:**<br>Ziyi Wang<br>(scyzw10)<br>**[Platform]:**<br>Windows10-IDEA<br>|
|**[TS-Category 2-2]**|**[Result]:**<br>`Fail`<br>**[Reason for Failure]:**<br>The source code did not include any exception.<br>**[Time]:**<br>2021/04/24<br>23:07<br>**[Tester]:**<br>Ziyi Wang<br>(scyzw10)<br>**[Platform]:**<br>Windows10-IDEA<br>![](testLog/TS-Category-2-1.png)|**[Modifier]**<br>Ziyi Wang(scyzw10)<br>**[Content(A)]:**<br>`if (newTitle.length() > 15){`<br>`throw new InvalidParameterException("Category Name at most 15 characters.");`<br>`}else{`<br>`CategoryName = newTitle;`<br>`}`|**[Result]:**<br>Pass<br>**[Time]:**<br>2021/4/24<br>23:13<br>**[Tester]:**<br>Ziyi Wang<br>(scyzw10)<br>**[Platform]:**<br>Windows10-IDEA|-|
|**[TS-Category 3-1]**|**[Result]:**<br>'Fail'<br> **[Reason for Failure]:**  <br>When name is null or longer than 15 characters, program can not report the error. <br>**[Time]:** <br>2021/04/23<br>20:41<br>**[Tester]:**<br>Yingxiao Huo<br>(scyyh9)<br>**[Platform]:**<br>Windows10-IDEA<br>![](testLog/TS-Category-3-1.png)|**[Modifier]**<br>Yingxiao Huo(scyyh9)<br>**[Content(A)]:**<br>`if (categoryName == null){`<br>`throw new IllegalException("Name is not set.");}`<br>`else if (CategoryName.length() > 15){`<br>`throw new IllegalArgumentException("Category name can not longer than 15 characters.");}`|**[Result]:**<br>Pass<br>**[Time]:**<br>2021/04/23<br>22:07<br>**[Tester]:**<br>Yingxiao Huo<br>(scyyh9)<br>**[Platform]:**<br>Windows10-IDEA|||
|**[TS-Category 4-1]**|**[Result]:** <br>`Pass` <br>**[Time]:**<br>2021/04/23 19:00<br>**[Tester]:**<br>Yicun Duan(scyyd3) **[Platform]**: Ubuntu-IDEA|-|**[Result]:** <br>`Pass` <br>**[Time]:**<br>2021/04/24 20:00<br>**[Tester]:**<br>Yicun Duan(scyyd3) **[Platform]**: Ubuntu-IDEA|-|**[Result]:** `Pass` <br>**[Time]:**<br>2021/04/25 17:00<br>**[Tester]:**<br>Yicun Duan(scyyd3) <br>**[Platform]**: <br>Ubuntu-IDEA|
|**[TS-Category 4-2]**|**[Result]:** <br>`Pass` <br>**[Time]:**<br>2021/04/23 19:00<br>**[Tester]:**<br>Yicun Duan(scyyd3) **[Platform]**: Ubuntu-IDEA|-|**[Result]:** <br>`Pass` <br>**[Time]:**<br>2021/04/24 20:00<br>**[Tester]:**<br>Yicun Duan(scyyd3) **[Platform]**: Ubuntu-IDEA|-|**[Result]:** `Pass` <br>**[Time]:**<br>2021/04/25 17:00<br>**[Tester]:**<br>Yicun Duan(scyyd3) <br>**[Platform]**: <br>Ubuntu-IDEA|
|**[TS-Category 5-1]**|**[Result]:** <br>`Pass`<br> **[Time]**<br>:2021/04/23 13:15<br>**[Tester]**:<br>Leshan Tan (sqylt2) <br>**[Platform]**: <br>MacOS-IDEA|-|**[Result]:** <br>`Pass`<br> **[Time]**:<br>2021/04/25 20:45<br>**[Tester]**:<br>Leshan Tan (sqylt2) <br>**[Platform]**: <br>MacOS-IDEA|-|-|-|
|**[TS-Category 5-2]**|**[Result]:** <br>`Pass`<br> **[Time]**:<br>2021/04/23 13:15<br>**[Tester]**:<br>Leshan Tan (sqylt2) <br>**[Platform]**: <br>MacOS-IDEA|-|**[Result]:** <br>`Pass`<br> **[Time]**:<br>2021/04/25 20:45<br>**[Tester]**:<br>Leshan Tan (sqylt2) <br>**[Platform]**: <br>MacOS-IDEA|-|**[Result]:** <br>`Pass`<br> **[Time]**:<br>2021/04/29 08:15<br>**[Tester]**:<br>Leshan Tan (sqylt2) <br>**[Platform]**: <br>MacOS-IDEA|-|
|**[TS-Category 6-1]**|**[Result]:**<br>`Fail`<br>**[Reason for Failure]:**<br>When name is null, can not report error, when longer than 15 characters, can not take the substring.<br>**[Time]:**<br>2021/04/21<br>18:16<br>**[Tester]:**<br>Yingxiao Huo<br>(scyyh9)<br>**[Platform]:**<br>Windows10-IDEA<br>![](testLog/TS-Category-6-1.png)|**[Modifier]**<br>Yingxiao Huo(scyyh9)<br>**[Content(A)]:**<br>`if (categoryName == null or newName.isBlank()){`<br>`throw new IllegalException("Name is not set.");}`<br>`else if (CategoryName.length() > 15){`<br>`CategoryName = newName.substring(0,15);}`|**[Result]:**<br>Pass<br>**[Time]:**<br>2021/04/28<br>22:26<br>**[Tester]:**<br>Yingxiao Huo<br>(scyyh9)<br>**[Platform]:**<br>Windows10-IDEA|||
|**[TS-Category 7-1]**|**[Result]:**<br>`Fail`<br>**[Reason for Failure]:**<br>The source code takes a **BigDecimal** Variable rather than **Float**.<br>**[Time]:**<br>2021/4/23<br>19：24<br>**[Tester]:**<br>Ziyi Wang<br>(scyzw10)<br>**[Platform]:**<br>Windows10-IDEA<br>![](testLog/TS-Category-7-1.png)|**[Modifier]**<br>Ziyi Wang(scyzw10)<br>**[Content(M)]:**<br>***Before***: `public void setCategoryBudget(BigDecimal newValue) {`<br>`if (newValue.compareTo(new BigDecimal("0.00")) == 1){`<br>`CategoryBudget = newValue;`<br>***After***: `public void setCategoryBudget(float newValue) {`<br>`NumberFormat formatter = new DecimalFormat("0.00");`<br>`BigDecimal newV = new BigDecimal(String.valueOf(formatter.format(newValue)));`<br>`if (newV.compareTo(new BigDecimal("0.00")) == 1){`<br>`CategoryBudget = newV;`<br>|**[Result]:**<br>`Pass`<br>**[Time]:**<br>2021/4/25<br>11:00<br>**[Tester]:**<br>Ziyi Wang<br>(scyzw10)<br>**[Platform]:**<br>Windows10-IDEA|-|-||
|**[TS-Category 8-1]**|**[Result]:** `Fail`<br> **[Reason For Failure]:** No `[NullPointerException]` thrown  **[Time]:**<br>2021/04/24 18:12<br>**[Tester]:**<br>Lin Chen (biylc2) **[Platform]**: Windows10-IDEA|**[Modifier]:**<br> Lin Chen (biylc2) <br> **[Content (A)]:**<br>`if(valueToAdd == null){throw new NullPointerException("Illegal input");}`<br> |**[Result]:** `Pass` <br> **[Time]:**<br>2021/04/24 16:15<br>**[Tester]:**<br>Lin Chen (biylc2) **[Platform]**: Windows10-IDEA|-|**[Result]:** `Pass` <br> **[Time]:**<br>2021/04/24 20:49<br>**[Tester]:**<br>Lin Chen (biylc2) **[Platform]**: Windows10-IDEA|-|
|**[TS-Category 8-2]**|**[Result]:** `Fail`<br>**[Reason For Failure]:** No `[IllegalArgumentException]` thrown **[Time]:**<br>2021/04/24 18:12<br>**[Tester]:**<br>Lin Chen (biylc2) **[Platform]**: Windows10-IDEA|**[Modifier]:**<br> Lin Chen (biylc2) <br> **[Content (A)]:**<br>`if (valueToAdd.compareTo(BigDecimal.ZERO)==-1) {throw new IllegalArgumentException("Illegal input");}` |**[Result]:** `Pass` <br> **[Time]:**<br>2021/04/24 16:15<br>**[Tester]:**<br>Lin Chen (biylc2) **[Platform]**: Windows10-IDEA|-|**[Result]:** `Pass` <br> **[Time]:**<br>2021/04/24 20:49<br>**[Tester]:**<br>Lin Chen (biylc2) **[Platform]**: Windows10-IDEA|-|
|**[TS-Category 8-3]**|**[Result]:** <br>`Pass` <br> **[Time]:**<br>2021/04/24 18:12<br>**[Tester]:**<br>Lin Chen (biylc2) **[Platform]**: Windows10-IDEA|-|**[Result]:** <br>`Pass` <br> **[Time]:**<br>2021/04/24 16:15<br>**[Tester]:**<br>Lin Chen (biylc2) **[Platform]**: Windows10-IDEA|-|**[Result]:** `Pass` <br> **[Time]:**<br>2021/04/24 20:49<br>**[Tester]:**<br>Lin Chen (biylc2) **[Platform]**: Windows10-IDEA|
|**[TS-Category 9-1]**|**[Result]:**<br>`Pass`<br>**[Time]:**<br>2021/4/22<br>20:38<br>**[Tester]:**<br>Ziyi Wang<br>(scyzw10)<br>**[Platform]:**<br>Windows10-IDEA|-|**[Result]:**<br>`Pass`<br>**[Time]:**<br>2021/4/25<br>22:41<br>**[Tester]:**<br>Ziyi Wang<br>(scyzw10)<br>**[Platform]:**<br>Windows10-IDEA|-|**[Result]:**<br>`Pass`<br>**[Time]:**<br>2021/4/27<br>14:21<br>**[Tester]:**<br>Ziyi Wang<br>(scyzw10)<br>**[Platform]:**<br>Windows10-IDEA|
|**[TS-Category 9-2]**|**[Result]:**<br>`Fail`<br>**[Reason for Failure]:**<br>The source code did not include an exception.<br>**[Time]:**<br>2021/4/22<br>20:38<br>**[Tester]:**<br>Ziyi Wang<br>(scyzw10)<br>**[Platform]:**<br>Windows10-IDEA<br>![](testLog/TS-Category-9-1.png)|**[Modifier]**<br>Ziyi Wang(scyzw10)<br>**[Content(A)]:**<br>`int comp1 = valueToRemove.compareTo(new BigDecimal(0));`<br>`if (comp1 == -1){`<br>`throw new InvalidParameterException("The valueToRemove must be >= 0");`<br>`}else{`<br>`CategorySpend = CategorySpend.subtract(valueToRemove);`<br>`}`|**[Result]:**<br>`Pass`<br>**[Time]:**<br>2021/4/25<br>11:19<br>**[Tester]:**<br>Ziyi Wang<br>(scyzw10)<br>**[Platform]:**<br>Windows10-IDEA|||
|**[TS-Category 9-3]**|**[Result]:**<br>`Fail`<br>**[Reason for Failure]:**<br>The source code did not include an exception.<br>**[Time]:**<br>2021/4/22<br>20:38<br>**[Tester]:**<br>Ziyi Wang<br>(scyzw10)<br>**[Platform]:**<br>Windows10-IDEA<br>![](testLog/TS-Category-9-2.png)|**[Modifier]**<br>Ziyi Wang(scyzw10)<br>**[Content(A)]:**<br>`int comp2 = CategorySpend.compareTo(new BigDecimal(0));`<br>`if (comp2 == -1) {`<br>`throw new InvalidParameterException("The CategorySpend is must be >= 0");`<br>`}`|**[Result]:**<br>`Pass`<br>**[Time]:**<br>2021/4/25<br>11:19<br>**[Tester]:**<br>Ziyi Wang<br>(scyzw10)<br>**[Platform]:**<br>Windows10-IDEA|||
|**[TS-Category 10-1]**|**[Result]:** <br>`Pass`<br> **[Time]:**<br>2021/04/21 08:58<br>**[Tester]:**<br>Lin Chen (biylc2) **[Platform]**: Windows10-IDEA|-|**[Result]:** <br>`Pass` <br> **[Time]:**<br>2021/04/24 16:15<br>**[Tester]:**<br>Lin Chen (biylc2) **[Platform]**: Windows10-IDEA|-|**[Result]:** `Pass` <br> **[Time]:**<br>2021/04/24 20:49<br>**[Tester]:**<br>Lin Chen (biylc2) **[Platform]**: Windows10-IDEA|-|
|**[TS-Category 11-1]**|**[Result]:** <br>`Pass` <br>**[Time]:**<br>2021/04/23 19:00<br>**[Tester]:**<br>Yicun Duan(scyyd3) <br>**[Platform]**: <br>Ubuntu-IDEA|-|**[Result]:** <br>`Pass` <br>**[Time]:**<br>2021/04/24 20:00<br>**[Tester]:**<br>Yicun Duan(scyyd3) <br>**[Platform]**: <br>Ubuntu-IDEA|-|**[Result]:** `Pass` <br>**[Time]:**<br>2021/04/25 17:00<br>**[Tester]:**<br>Yicun Duan(scyyd3) <br>**[Platform]**: <br>Ubuntu-IDEA|-|
|**[TS-Category 12-1]**|**[Result]:**<br> `Fail`<br>**[Reason For Failure]:** The number is negative and "Remaining" should be "OverSpent" **[Time]:**<br>2021/04/21 23:39<br>**[Tester]:**<br>Lin Chen (biylc2) **[Platform]**: Windows10-IDEA ![](testLog/TS-Category-12-1.png)|**[Modifier]:**<br> Lin Chen (biylc2) <br> **[Content (M)]:** <br> ***Before:*** <br>`return CategoryName + "(¥" + CategoryBudget.toPlainString() + ") - Est. ¥" + CategorySpend.toPlainString()+ " (¥" + getRemainingBudget().toPlainString() + " Remaining)";`<br>***After:***<br>`if (getRemainingBudget().compareTo(new BigDecimal("0.00")) > -1) {return "[" + CategoryName + "]" + "(Budget: ¥" + CategoryBugdet + ") - ¥" + CategotySpend+ " (¥" + Category.getRemainingBuget() + " Remaining)";}`<br>|**[Result]:**<br> `Fail` **[Time]:**<br>2021/04/28 20:40<br>**[Tester]:**<br>Lin Chen (biylc2) **[Platform]**: Windows10-IDEA|**[Modifier]:**<br> Lin Chen (biylc2) <br> **[Content (M)]:**<br> ***Before:***<br>`if (getRemainingBudget().compareTo(new BigDecimal("0.00")) > -1) {return "[" + CategoryName + "]" + "(Budget: ¥" + CategoryBugdet + ") - ¥" + CategotySpend+ " (¥" + Category.getRemainingBuget() + " Remaining)";}`<br>***After:*** <br>`if (getRemainingBudget().compareTo(new BigDecimal("0.00"))>-1){DecimalFormat convers=new DecimalFormat("0.00");`<br>`String afterBugdet =convers.format(CategoryBudget);`<br>`String afterSpend =convers.format(CategorySpend);`<br>`String afterRemain =convers.format(getRemainingBudget());`<br>`return "[" + CategoryName + "]" + "(Budget: ¥" + afterBugdet + ") - ¥" + afterSpend + " (¥" + afterRemain + " Remaining)";}`<br>|**[Result]:** `Pass` **[Time]:**<br>2021/04/29 00:12<br>**[Tester]:**<br>Lin Chen (biylc2) **[Platform]**: Windows10-IDEA||-|
|**[TS-Category 12-2]**|**[Result]:** <br>`Fail`<br>  **[Reason For Failure]:** The format doesn't match <br> **[Time]:**<br>2021/04/27 23:39<br>**[Tester]:**<br>Lin Chen (biylc2) **[Platform]**: Windows10-IDEA ![](testLog/TS-Category-12-1.png)|**[Modifier]:**<br> Lin Chen (biylc2) <br> **[Content (M)]:*****Before:***<br>`if (getRemainingBudget().compareTo(new BigDecimal("0.00")) > -1) {return "[" + CategoryName + "]" + "(Budget: ¥" + CategoryBugdet + ") - ¥" + CategotySpend+ " (¥" + Category.getRemainingBuget() + " Remaining)";}`<br>***After:*** <br>`if (getRemainingBudget().compareTo(new BigDecimal("0.00")) > -1) {return "[" + CategoryName + "]" + "(Budget: ¥" + CategoryBugdet + ") - ¥" + CategotySpend+ " (¥" + Category.getRemainingBuget() + " Remaining)";}`<br>|**[Result]:** `Fail` **[Reason For Failure]:** The value should only have 2 decimal numbers<br> **[Time]:**<br>2021/04/28 20:40<br>**[Tester]:**<br>Lin Chen (biylc2) **[Platform]**: Windows10-IDEA|**[Modifier]:**<br> Lin Chen (biylc2) <br> **[Content (M)]:**<br> ***Before:***<br>`if (getRemainingBudget().compareTo(new BigDecimal("0.00")) > -1) {return "[" + CategoryName + "]" + "(Budget: ¥" + CategoryBugdet + ") - ¥" + CategotySpend+ " (¥" + Category.getRemainingBuget() + " Remaining)";}`<br>***After:*** <br>`if (getRemainingBudget().compareTo(new BigDecimal("0.00"))>-1){DecimalFormat convers=new DecimalFormat("0.00");`<br>`String afterBugdet =convers.format(CategoryBudget);`<br>`String afterSpend =convers.format(CategorySpend);`<br>`String afterRemain =convers.format(getRemainingBudget());`<br>`return "[" + CategoryName + "]" + "(Budget: ¥" + afterBugdet + ") - ¥" + afterSpend + " (¥" + afterRemain + " Remaining)";}`<br>|-|**[Result]:** `Pass` **[Time]:**<br>2021/04/29 00:12<br>**[Tester]:**<br>Lin Chen (biylc2) **[Platform]**: Windows10-IDEA|-|
|**[TS-Category 12-3]**|**[Result]:** <br>`Fail`<br>  **[Reason For Failure]:** The format doesn't match<br> **[Time]:**<br>2021/04/27 23:39<br>**[Tester]:**<br>Lin Chen (biylc2) **[Platform]**: Windows10-IDEA ![](testLog/TS-Category-12-1.png)|**[Modifier]:**<br> Lin Chen (biylc2) <br> **[Content (M)]:*****Before:*** <br>`if (getRemainingBudget().compareTo(new BigDecimal("0.00")) > -1) {return "[" + CategoryName + "]" + "(Budget: ¥" + CategoryBugdet + ") - ¥" + CategotySpend+ " (¥" + Category.getRemainingBuget() + " Remaining)";}`<br>***After:*** <br>`else {return "[" + CategoryName + "]" + "(Budget: ¥" + CategoryBugdet + ") - ¥" + CategotySpend+ " (¥" + Category.getRemainingBuget().abs() + " Overspent)";}`<br>|**[Result]:** `Fail` <br>  **[Reason For Failure]:** The value should only have 2 decimal numbers<br> **[Time]:**<br>2021/04/28 20:40<br>**[Tester]:**<br>Lin Chen (biylc2) **[Platform]**: Windows10-IDEA|**[Modifier]:**<br> Lin Chen (biylc2) <br> **[Content (M)]:**<br> ***Before:***<br>`else {return "[" + CategoryName + "]" + "(Budget: ¥" + CategoryBugdet + ") - ¥" + CategotySpend+ " (¥" + Category.getRemainingBuget().abs() + " Overspent)";}`<br>***After:*** <br>`else{DecimalFormat convers=new DecimalFormat("0.00");`<br>`String afterBugdet =convers.format(CategoryBudget);`<br>`String afterSpend =convers.format(CategorySpend);`<br>`String afterRemain =convers.format(getRemainingBudget().abs());`<br>`return "[" + CategoryName + "]" + "(Budget: ¥" + afterBugdet + ") - ¥" + afterSpend+ " (¥" + afterRemain + " Overspent)";}`<br>|-|**[Result]:** `Pass`<br> **[Time]:**<br>2021/04/29 00:12<br>**[Tester]:**<br>Lin Chen (biylc2) **[Platform]**: Windows10-IDEA|-|
|**[TS-Category 12-4]**|**[Result]:** <br>`Fail`<br>**[Reason for Failure]:**<br> The format does not match. <br>**[Time]:**<br>2021/04/27 23:39<br>**[Tester]:**<br>Lin Chen (biylc2) **[Platform]**: Windows10-IDEA ![](testLog/TS-Category-12-1.png)|**[Modifier]:**<br> Lin Chen (biylc2) <br>**[Content (M)]:*****Before:*** <br>`if (getRemainingBudget().compareTo(new BigDecimal("0.00")) > -1) {return "[" + CategoryName + "]" + "(Budget: ¥" + CategoryBugdet + ") - ¥" + CategotySpend+ " (¥" + Category.getRemainingBuget() + " Remaining)";}`<br>***After:*** <br>`else {return "[" + CategoryName + "]" + "(Budget: ¥" + CategoryBugdet + ") - ¥" + CategotySpend+ " (¥" + Category.getRemainingBuget().abs() + " Overspent)";}`<br>|**[Result]:** `Fail`<br> **[Time]:**<br>2021/04/28 20:40<br>**[Tester]:**<br>Lin Chen (biylc2) **[Platform]**: Windows10-IDEA|**[Modifier]:**<br> Lin Chen (biylc2) <br> **[Content (M)]:**<br> ***Before:***<br>`if (getRemainingBudget().compareTo(new BigDecimal("0.00")) > -1) {return "[" + CategoryName + "]" + "(Budget: ¥" + CategoryBugdet + ") - ¥" + CategotySpend+ " (¥" + Category.getRemainingBuget() + " Remaining)";}`<br>***After:*** <br>`if (getRemainingBudget().compareTo(new BigDecimal("0.00"))>-1){DecimalFormat convers=new DecimalFormat("0.00");`<br>`String afterBugdet =convers.format(CategoryBudget);`<br>`String afterSpend =convers.format(CategorySpend);`<br>`String afterRemain =convers.format(getRemainingBudget());`<br>`return "[" + CategoryName + "]" + "(Budget: ¥" + afterBugdet + ") - ¥" + afterSpend + " (¥" + afterRemain + " Remaining)";}`<br>|-|**[Result]:** `Pass` <br> **[Time]:**<br>2021/04/29 00:12<br>**[Tester]:**<br>Lin Chen (biylc2) **[Platform]**: Windows10-IDEA|-|


### *Class:* `BoCApp`

### **Test Plan**
`Test Schedule:` <br>
- `Milestone:` ***"Write test script for BoC App Class"*** <br>
- `Milestone:` ***"Fix script for BoC App Class"***

|Test ID|Type|Inputs|Expected Outcome|Importance|
|----|---------|------|----------------|-------|
|**[TS-App 1-1]**|**[Validation Test]:**<br>Test whether the outcome of **main** is correct|<table border="1"><tr><th>UserInput</th></tr><tr><td>O</td></tr><tr><td>T</td></tr><tr><td>1</td></tr><tr><td>X</td></tr></table>|<table border="1"><tr><th>Main()</th></tr><tr><td>![main1](expected/expected_main_1.png)![main2](expected/expected_main_2.png)</td></tr></table>|5|
|**[TS-App 1-2]**|**[Validation Test]:**<br>Test whether the outcome of **main** is correct|<table border="1"><tr><th>UserInput</th></tr><tr><td>T</td></tr><tr><td>N</td></tr><tr><td>Food</td></tr><tr><td>100.00</td></tr><tr><td>A</td></tr><tr><td>Breakfast</td></tr><tr><td>5.0000</td></tr><tr><td>5</td></tr><tr><td>T</td></tr><tr><td>O</td></tr><tr><td>C</td></tr><tr><td>8</td></tr><tr><td>1</td></tr><tr><td>T</td></tr><tr><td>O</td></tr><tr><td>rrr</td></tr><tr><td>X</td></tr></table>|<table border="1"><tr><th>Main()</th></tr><tr><td>![main3](expected/expected_main_3.png)<br>![main4](expected/expected_main_4.png)<br>![main5](expected/expected_main_5.png)<br>![main6](expected/expected_main_6.png)![main7](expected/expected_main_7.png)</td></tr></table>|5|
|**[TS-App 2-1]**|**[Validation Test]:**<br>Test whether the outcome of all the transaction listed is correct |<table border="1"><tr><th>listTransactions</th></tr><td>-</td><tr></tr></table>|<table border="1"><tr><th>listTransactions</th></tr><td>![listTrans](expected/expected_listTrans.png)</td><tr></tr></table>|2|
|**[TS-App 3-1]**|**[Validation Test]:**<br>Test whether the outcome of category overview is correct |<table border="1"><tr><th>CategoryName: </th><th>CategoryBudget: </th></tr><tr><td>"Unknown"</td><td>&nbsp;</td></tr><tr><td>"Bills"</td><td>BigDecimal("120.00")</td></tr><tr><td>"Groceries"</td><td>BigDecimal("75.00")</td></tr><tr><td>"Soical"</td><td>BigDecimal("100.00")</td></tr></table> |<p>1) [Unknown](Budget: ¥0.00) - ¥850.00 (¥850.00 Overspent)<br>2) [Bills](Budget: ¥120.00) - ¥112.99 (¥7.01 Remaining)<br>3) [Groceries](Budget: ¥75.00) - ¥31.00 (¥44.00 Remaining)<br>4) [Social](Budget: ¥100.00) - ¥22.49 (¥77.51 Remaining) </p>|5|
|**[TS-App 4-1]**|**[Validation Test]:**<br>Test whether the outcome of all the transaction listed for particular category is correct|<table border="1"><tr><th>chosenCategory</th></tr><tr><td>0</td></tr><tr><td>1</td></tr><tr><td>2</td></tr><tr><td>3</td></tr><tr><td>4</td></tr><tr><td>5</td></tr><tr><td>-1</td></tr></table>|<table border="1"><tr><th>ListTrasactionsinCategoryFunction</th></tr><tr><td>![listTransForCate](expected/expected_listTransForCate.png)</td></tr></table>|2|
|**[TS-App 5-1]**|**[Validation Test]:**<br>Test changing transaction name with normal input | <table border="1"><tr><th>ChangeTransactionCategory</th></tr><tr><td>C</td></tr><tr><td>1</td></tr><tr><td>4</td></tr><tr><td>C</td></tr><tr><td>3</td></tr><tr><td>1</td></tr><tr><td>C</td></tr><tr><td>6</td></tr><tr><td>3</td></tr><tr><td>X</td></tr></table> |<table border="1"><tr><td>ChangeTransactionCategory</td></tr><tr><td>![expected_ChangeTransactionCategory_1](expected/expected_ChangeTransactionCategory_1.png)</td></tr><tr><td>![expected_ChangeTransactionCategory_2](expected/expected_ChangeTransactionCategory_2.png)</td></tr><tr><td>![expected_ChangeTransactionCategory_3](expected/expected_ChangeTransactionCategory_3.png)</td></tr><tr><td>![expected_ChangeTransactionCategory_4](expected/expected_ChangeTransactionCategory_4.png)</td></tr></table>|5|
|**[TS-App 5-2]**|**[Validation Test]:**<br>Test changing transaction name with invalid input |<table border="1"><tr><th>ChangeTransactionCategory</th></tr><tr><td>C</td></tr><tr><td>jbl</td></tr><tr><td>-23</td></tr><tr><td>-123456789123456789</td></tr><tr><td>'\ue250'</td></tr><tr><td>1</td></tr><tr><td>-199</td></tr><tr><td>233</td></tr><tr><td>ooooo</td></tr><tr><td>4</td></tr><tr><td>X</td></tr></table> |<table border="1"><tr><td>ChangeTransactionCategory</td></tr><tr><td>![expected_ChangeTransactionCategory_5](expected/expected_ChangeTransactionCategory_5.png)</td></tr><tr><td>![expected_ChangeTransactionCategory_6](expected/expected_ChangeTransactionCategory_6.png)</td></tr><tr><td>![expected_ChangeTransactionCategory_7](expected/expected_ChangeTransactionCategory_7.png)</td></tr></table>|5|
|**[TS-App 6-1]**|**[Validation Test]:**<br>Test whether the outcome of **add the transaction** is correct|<table border="1"><tr><th>UserInput</th></tr><tr><td>A</td></tr><tr><td>Electricity Bill</td></tr><tr><td>9.00</td></tr><tr><td>2</td></tr><tr><td>X</td></tr></table>|<table><tr><td>AddTransaction</td></tr><tr><td>![expected_AddTransaction_1](expected/expected_AddTransaction_1.png)</td></tr></table>|5|
|**[TS-App 6-2]**|**[Defect test]:**<br>Test when transaction value is not a number, value is negative, categoryNumber is not a number or not exist |<table border="1"><tr><th>UserInput</th><tr><td>A</td></tr><tr><td>Water Bill</td></tr><tr><td>aaa</td></tr><tr><td>-1.0</td></tr><tr><td>9.0000</td></tr><tr><td>rr</td></tr><tr><td>-1</td></tr><tr><td>100</td></tr><tr><td>2</td></tr></table>|<table><tr><td>AddTransaction</td></tr><tr><td>![expected_AddTransaction_2](expected/expected_AddTransaction_2.png)![expected_AddTransaction_3](expected/expected_AddTransaction_3.png)</td></tr></table>|5|
|**[TS-App 7-1]**|**[Defect test]:**<br>Test when name is null, name is too long, value is negative, value is not digital, name is exist|<table border = "1"><tr><th>CategoryName</th><th>Budget</th></tr><tr><td>CW3 is so easy</td><td>100</td></tr><tr><td>Bills</td><td>null</td></tr><tr><td>blabla#$%%^&</td><td>-100</td></tr><tr><td>abc</td><td>abc@#</td></tr><tr><td>Rent</td><td>999</td></tr><tr><td>123451234512345123</td><td>100</td></tr></table>|<table border="1"><th>AddCategory</th></tr><tr><td>![expected/expected_AddCategory](expected/expected_AddCategory.png)</td></tr></table>|5|

### **Test Log**
|Test ID|Attempt-1|Modification|Attempt-2|Modification|Attempt-3|Modification|
|---|---|---|---|---|---|---|
|**[TS-App 1-1]**|**[Result]:**<br>`Fail`<br>**[Time]:**<br>2021/04/27<br>14:45<br>**[Tester]:**<br>Ziyi Wang<br>(scyzw10)<br>**[Platform]:**<br>Windows10-IDEA![](testLog/TS-App-1-1.png)|**[Modifier]:**<br>Leshan Tan(sqylt2) <br> **[Content (M)]:**<br> ***Before:*** <br> `System.out.println("Command not recognised");`<br>***After:***<br>`try{`<br>`ListTransactionsForCategory(Integer.parseInt(s));`<br>`}catch (NumberFormatException exc){`<br>`System.out.println("Command not recognised");`<br>`}`|**[Result]:**<br>`Pass`<br>**[Time]:**<br>2021/04/28<br>17:45<br>**[Tester]:**<br>Ziyi Wang<br>(scyzw10)<br>**[Platform]:**<br>Windows10-IDEA||
|**[TS-App 1-2]**|**[Result]:**<br>`Fail`<br>**[Time]:**<br>2021/04/27<br>14:45<br>**[Tester]:**<br>Ziyi Wang<br>(scyzw10)<br>**[Platform]:**<br>Windows10-IDEA![](testLog/TS-App-1-1.png)|-|**[Result]:**<br>`Pass`<br>**[Time]:**<br>2021/04/28<br>17:45<br>**[Tester]:**<br>Ziyi Wang<br>(scyzw10)<br>**[Platform]:**<br>Windows10-IDEA||
|**[TS-App 2-1]**|**[Result]:** <br>`Fail`<br> **[Reason For Failure]:** The toString function doesn't match the expected format  <br>**[Time]:**<br>2021/04/25 22:35<br>**[Tester]:**<br>Lin Chen (biylc2) **[Platform]**: Windows10-IDEA<br>![](testLog/TS-App-2-1.png)|**[Modifier]:**<br> Lin Chen (biylc2) <br> **[Content (A)]:** <br>`for (int x = 0; x < UserTransactions.size(); x++) {BoCTransaction temp = UserTransactions.get(x);`<br>`System.out.println((x + 1) + ") " + temp.transactionName()+" ("+UserCategories.get(temp.transactionCategory()).CategoryName()+") - ¥"+temp.transactionValue());}`<br>|**[Result]:** `Pass`<br> **[Time]:**<br>2021/04/27 23:45<br>**[Tester]:**<br>Lin Chen (biylc2) **[Platform]**: Windows10-IDEA||**[Result]:** `Fail`<br> **[Time]:**<br>2021/04/28 23:23<br>**[Tester]:**<br>Lin Chen (biylc2) **[Platform]**: Windows10-IDEA|
|**[TS-App 3-1]**|**[Result]:** <br>`Pass` <br>**[Time]:**<br>2021/04/26 22:00<br>**[Tester]:**<br>Yicun Duan(scyyd3) **[Platform]**: <br>Ubuntu-IDEA|-|**[Result]:** `Pass` <br>**[Time]:**<br>2021/04/26 23:50<br>**[Tester]:**<br>Yicun Duan(scyyd3) **[Platform]**: <br>Ubuntu-IDEA|-|**[Result]:** `Pass` <br>**[Time]:**<br>2021/04/27 12:40<br>**[Tester]:**<br>Yicun Duan(scyyd3) **[Platform]**: <br>Ubuntu-IDEA|-|
|**[TS-App 4-1]**|**[Result]:** `Fail`<br> **[Reason for Failure]:**<br>The output transaction list for a particular category is not what we expect<br>**[Time]**:`2021/04/26 21:28`<br>**[Tester]**:`Leshan Tan (sqylt2)` <br>**[Platform]**: `MacOS-IDEA`<br>![](testLog/TS-App-4-1.png)|**[Modifier]:** `Leshan Tan (sqylt2)` <br> **[Content (M)]:**<br>***Before***:<br> ![oldListTrans](expected/old_listTransForCate.png)<br> ***After***: ![newListTrans](expected/new_listTransForCate.png)|**[Result]**: `Pass` <br> **[Time]**: `2021/04/28 19:43`<br> **[Tester]**: `Leshan Tan (sqylt2)`<br> **[Platform]**: `MacOS-IDEA`|-|**[Result]**: `Pass` <br> **[Time]**: `2021/04/29 08:43`<br> **[Tester]**: `Leshan Tan (sqylt2)`<br> **[Platform]**: `MacOS-IDEA`|-||
|**[TS-App 5-1]**|**[Result]:** `Fail` <br> **[Reason for Failure]:** <br>The program cannot generate expected output, and it cannot reset expense for old category.<br>**[Time]:**<br>2021/04/26 22:00<br>**[Tester]:**<br>Yicun Duan(scyyd3) **[Platform]**: <br>Ubuntu-IDEA<br>![](testLog/TS-App-5-1.png)| **[Modifier]:**<br> Yicun Duan(scyyd3) <br> **[Content (M)]:**<br> ***Before:***<br>![Fix_ChangeTransactionCategory_code_3](fix/Fix_ChangeTransactionCategory_code_3.png)<br> ***After:*** <br>![Fix_ChangeTransactionCategory_code_1](fix/Fix_ChangeTransactionCategory_code_1.png) |**[Result]:** `Pass` <br>**[Time]:**<br>2021/04/26 23:50<br>**[Tester]:**<br>Yicun Duan(scyyd3) **[Platform]**: <br>Ubuntu-IDEA|-|**[Result]:** `Pass` <br>**[Time]:**<br>2021/04/27 12:40<br>**[Tester]:**<br>Yicun Duan(scyyd3) **[Platform]**: <br>Ubuntu-IDEA|-|
|**[TS-App 5-2]**|**[Result]:**<br> `Fail` <br> **[Reason for Failure]:** <br>The program cannot generate expected output. And it cannot deal with invalid input.<br>**[Time]:**<br>2021/04/26 22:00<br>**[Tester]:**<br>Yicun Duan(scyyd3) **[Platform]**: <br>Ubuntu-IDEA| **[Modifier]:**<br> Yicun Duan(scyyd3) <br> **[Content (A)]:**<br> ![Fix_ChangeTransactionCategory_code_2](fix/Fix_ChangeTransactionCategory_code_2.png) |**[Result]:** `Pass` <br>**[Time]:**<br>2021/04/26 23:50<br>**[Tester]:**<br>Yicun Duan(scyyd3) **[Platform]**: <br>Ubuntu-IDEA|-|**[Result]:** `Pass` <br>**[Time]:**<br>2021/04/27 12:40<br>**[Tester]:**<br>Yicun Duan(scyyd3) **[Platform]**: <br>Ubuntu-IDEA|-|
|**[TS-App 6-1]**|**[Result]:**<br>`Fail`<br>**[Reason for Failure]:**<br>The printout format is nor correct.<br>**[Time]:**<br>2021/04/26<br>14:39<br>**[Tester]:**<br>Ziyi Wang<br>(scyzw10)<br>**[Platform]:**<br>Windows10-IDEA<br>![](testLog/TS-App-6-1.png)|**[Modifier]:**<br> Ziyi Wang(scyzw10)<br>**[Content (A)]:**<br>`System.out.println("[" + title + "](¥" + tvalue.toString() + ") was added to [" +UserCategories.get(tCat-1).CategoryName() + "]");`|**[Result]:**<br>`Pass`<br>**[Time]:**<br>2021/04/27<br>14；45<br>**[Tester]:**<br>Ziyi Wang<br>(scyzw10)<br>**[Platform]:**<br>Windows10-IDEA|||
|**[TS-App 6-2]**|**[Result]:**<br>`Fail`<br>**[Reason for Failure]:**<br>The method did not include any exception.<br>**[Time]:**<br>2021/04/26<br>14:39<br>**[Tester]:**<br>Ziyi Wang<br>(scyzw10)<br>**[Platform]:**<br>Windows10-IDEA<br>![](testLog/TS-App-6-1.png)|**[Modifier]:**<br> Ziyi Wang(scyzw10)<br>**[Content (A)]:**<br>![Fix_AddTransaction_1](fix/Fix_AddTransaction_1.png)![Fix_AddTransaction_2](fix/Fix_AddTransaction_2.png)|**[Result]:**<br>`Pass`<br>**[Time]:**<br>2021/4/28<br>19:47<br>**[Tester]:**<br>Ziyi Wang<br>(scyzw10)<br>**[Platform]:**<br>Windows10-IDEA|**[Modifier]:**<br> Ziyi Wang(scyzw10)<br>**[Content (A)]:**<br>![Fix_AddTransaction_3](fix/Fix_AddTransaction_3.png)|**[Result]:**<br>`Pass`<br>**[Time]:**<br>2021/4/29<br>01:32<br>**[Tester]:**<br>Ziyi Wang<br>(scyzw10)<br>**[Platform]:**<br>Windows10-IDEA|
|**[TS-App 7-1]**|**[Result]:**<br>`Fail`<br>**[Reason for Failure]:** <br>Program can not handle the cases: value is negative, value is not digital, name is too long, name is already setted. <br>**[Time]:**<br>2021/4/28 15:12<br>**[Tester]:**<br>Yingxiao Huo<br>(scyyh9)<br>**[Platform]:**<br>Windows10-IDEA<br>![](testLog/TS-App-7-1.png)|**[Modifier]:**<br>Yingxiao Huo(scyyh9)<br>**[Content(M)]:**<br>**Before:**<br>![fix/TS-App-7-1-before](fix/TS-App-7-1-before.png) <br>**After:**<br>![fix/TS-App-7-1-after-1](fix/TS-App-7-1-after-1.png) <br>![fix/TS-App-7-1-after-2](fix/TS-App-7-1-after-2.png)<br>|**[Result]:**<br>`Pass`<br>**[Time]:**<br>2021/4/28 22:49<br>**[Tester]:**<br>Yingxiao Huo<br>(scyyh9)<br>**[Platform]:**<br>Windows10-IDEA<br>||**[Result]:**<br>`Pass`<br>**[Time]:**<br>2021/4/29 08:49<br>**[Tester]:**<br>Yingxiao Huo<br>(scyyh9)<br>**[Platform]:**<br>Windows10-IDEA<br>|

&nbsp;

### **Integration test log**

|Integration ID|Test Info|Failed TestID| Pass TestID|Other info|
|----------|-----------|----------------|------|----|
|Integration-1|**Time:** 2021/04/27 19:42<br> **Tester:** Zixiang Hu (scyzh6)<br> **Platform:** Windows10-IDEA|<table border="1"><tr><th>Test ID</th><th>Details</th></tr><tr><td>TS-Transaction 7</td><td>![](testLog/IN-Trans-7.png) </td></tr><tr><td>TS-Transaction 10 </td><td>![](testLog/IN-Trans-10.png)</td></tr><tr><td>TS-Category 8 </td><td>![](testLog/IN-Cate-8.png)</td></tr></table>|<table border="1"><tr><td>TS-Transaction 1</td><td>TS-Transaction 2</td><td>TS-Transaction 3</td><td>TS-Transaction 4</td><td>TS-Transaction 5</td><td>TS-Transaction 6</td><td>TS-Transaction 8</td><td>TS-Transaction 9</td><td>TS-Transaction 10</td><td>TS-Transaction 11</td></tr><tr><td>TS-Category 1</td><td>TS-Category 2</td><td>TS-Category 3</td><td>TS-Category 4</td><td>TS-Category 5</td><td>TS-Category 6</td><td>TS-Category 7</td><td>TS-Category 9</td><td>TS-Category 10</td><td>TS-Category 11</td><td>TS-Category 12</td></tr></table>|`[The failed result of AddTransaction in the Categoty class may be due to the modification of the constructor]`|
|Integration-2|**Time:** 2021/04/27 21:43<br> **Tester:** Zixiang Hu (scyzh6)<br> **Platform:** Windows10-IDEA|<table border="1"><tr><th>Test ID</th><th>Details</th></tr><tr><td>TS-App 1</td><td rowspan="4">![Tests for App Class](testLog/IN-App-1.png)</tr><tr><td>TS-App 2</td></tr><tr><td>TS-App 3</td></tr><tr><td>TS-App 6</td></tr></table>|<table border="1"><tr><td>TS-App 4</td><td>TS-App 5</td><td>TS-App 7</td></tr></table>||
|Integration-3|**Time:** 2021/04/27 21:43<br> **Tester:** Zixiang Hu (scyzh6)<br> **Platform:** Windows10-IDEA|<table border="1"><tr>-</tr></table>|All [+Pass+]||

