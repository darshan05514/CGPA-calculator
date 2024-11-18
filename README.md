# CGPA-calculator
CGPA calculator 
## Things i learnt through this project
## CGPA Calculator

This CGPA Calculator allows you to calculate your CGPA based on your grades for each subject.

## Instructions:
1. Enter your grades for each subject.
2. Press the "Calculate" button to compute your CGPA.

## Enter your details:

<form id="cgpaForm">
  <label for="subject1">Subject 1 (Grade Points):</label><br>
  <input type="number" id="subject1" name="subject1" required><br><br>
  
  <label for="subject2">Subject 2 (Grade Points):</label><br>
  <input type="number" id="subject2" name="subject2" required><br><br>
  
  <label for="subject3">Subject 3 (Grade Points):</label><br>
  <input type="number" id="subject3" name="subject3" required><br><br>
  
  <label for="subject4">Subject 4 (Grade Points):</label><br>
  <input type="number" id="subject4" name="subject4" required><br><br>
  
  <label for="subject5">Subject 5 (Grade Points):</label><br>
  <input type="number" id="subject5" name="subject5" required><br><br>
  
  <label for="subject6">Subject 6 (Grade Points):</label><br>
  <input type="number" id="subject6" name="subject6"><br><br>

  <button type="button" onclick="calculateCGPA()">Calculate CGPA</button>
</form>

## CGPA Result:

<p id="cgpaResult"></p>

<script>
  function calculateCGPA() {
    var subject1 = parseFloat(document.getElementById('subject1').value);
    var subject2 = parseFloat(document.getElementById('subject2').value);
    var subject3 = parseFloat(document.getElementById('subject3').value);
    var subject4 = parseFloat(document.getElementById('subject4').value);
    var subject5 = parseFloat(document.getElementById('subject5').value);
    var subject6 = parseFloat(document.getElementById('subject6').value) || 0; // Optional sixth subject

    var totalSubjects = 5; // Default 5 subjects
    if (subject6 > 0) totalSubjects = 6;

    var totalGradePoints = subject1 + subject2 + subject3 + subject4 + subject5 + subject6;
    var cgpa = totalGradePoints / totalSubjects;
    
    document.getElementById('cgpaResult').innerHTML = "Your CGPA is: " + cgpa.toFixed(2);
  }
</script>
