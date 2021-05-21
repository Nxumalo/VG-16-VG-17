public static void calculateAverage(Scanner inp, DoubleClass courseAvg){
  
  double totalScore = 0.0;
  int numberOfstudents = 0;
  int score = 0;
  
  score = inp.nextInt();
  
  while(score ！= -999){
    
    totalScore = totalScore + score;
    numberOfStudents++;
    score = inp.nextInt();
    
  }
  
  courseAvg.setNum(totalScore / numberOfStudents);
}
