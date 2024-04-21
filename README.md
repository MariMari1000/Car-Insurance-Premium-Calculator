<h1>Car Insurance Premium Calculator</h1>

<p>
  This project includes a Java application <code>InsuranceProgram</code> that calculates car insurance premiums based on age and accident history. Additionally, it provides a JUnit test suite (<code>InsuranceProgramTest</code>) and a test suite runner (<code>Runner</code>) for validating the application's functionality.
</p>

<h2>Project Structure</h2>

<p>
  The project directory structure is as follows:
</p>

<pre>
insurance-calculator/
├── src/
│   └── ie/
│       └── atu/
│           └── dip/
│               ├── InsuranceProgram.java
│               ├── InsuranceProgramTest.java
│               └── Runner.java
└── junit-platform-console-standalone-x.x.x.jar
</pre>

<ul>
  <li><code>InsuranceProgram.java</code>: Contains the main application logic for calculating insurance premiums.</li>
  <li><code>InsuranceProgramTest.java</code>: Contains JUnit test cases to validate the functionality of <code>InsuranceProgram</code>.</li>
  <li><code>Runner.java</code>: Defines a JUnit test suite to orchestrate the execution of test classes.</li>
</ul>

<h2>Requirements</h2>

<ul>
  <li>Java Development Kit (JDK) 8 or higher</li>
  <li>JUnit 5 (JUnit Platform) for testing</li>
  <li><code>junit-platform-console-standalone-x.x.x.jar</code> for running JUnit test suites from the command line</li>
</ul>

<h2>Usage</h2>

<h3>Running the Application</h3>

<p><strong>Compile the Application:</strong></p>

<pre><code>javac ie/atu/dip/InsuranceProgram.java</code></pre>

<p><strong>Run the Application:</strong></p>

<pre><code>java ie.atu.dip.InsuranceProgram &lt;age&gt; &lt;accidents_before_25&gt; &lt;accidents_after_25&gt;</code></pre>

<p>Replace <code>&lt;age&gt;</code>, <code>&lt;accidents_before_25&gt;</code>, and <code>&lt;accidents_after_25&gt;</code> with appropriate integer values.</p>

<p><strong>Example:</strong></p>

<pre><code>java ie.atu.dip.InsuranceProgram 30 1 0</code></pre>

<h3>Running JUnit Tests</h3>

<p><strong>Compile the Test Suite and Test Classes:</strong></p>

<pre><code>javac -cp .:junit-platform-console-standalone-x.x.x.jar ie/atu/dip/*.java</code></pre>

<p><strong>Run the Test Suite (Runner):</strong></p>

<pre><code>java -cp .:junit-platform-console-standalone-x.x.x.jar org.junit.platform.console.ConsoleLauncher --select-class ie.atu.dip.Runner</code></pre>

<h2>Test Cases</h2>

<ul>
  <li><strong>IllegalAgeForDrivingException Test:</strong> Validates that an <code>IllegalArgumentException</code> is thrown for an illegal driving age.</li>
  <li><strong>StringAsArgumentForAgeException Test:</strong> Validates that a <code>NumberFormatException</code> is thrown when a string value is provided instead of an integer for age.</li>
  <li><strong>AgeLessThan25AndAllAccidentVariations Test:</strong> Parameterized test covering different scenarios for drivers under 25 with varying accident histories.</li>
  <li><strong>AgeMoreThan25AndAccidents Tests:</strong> Individual test cases for drivers aged 25 or older with different accident histories.</li>
</ul>

<h2>Contributing</h2>

<p>
  Contributions to this project are welcome. To contribute:
</p>

<ol>
  <li>Fork the repository</li>
  <li>Create your feature branch (<code>git checkout -b feature/new-feature</code>)</li>
  <li>Commit your changes (<code>git commit -am 'Add new feature'</code>)</li>
  <li>Push to the branch (<code>git push origin feature/new-feature</code>)</li>
  <li>Create a new Pull Request</li>
</ol>



