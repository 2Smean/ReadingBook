package tdd_test_case;

public class SimpleScoreStrategy implements ScoreStrategy {
    @Override
    public String computeGrade(Score score) {

        int totalScore = score.getMiddleScore() + score.getFinalScore() + score.getHomeworkScore(); // 점수통합

        String gradeResult = null;

        if (totalScore >= 90) {
            gradeResult = "A";
        }else if (totalScore >= 80) {
            gradeResult = "B";
        }else if (totalScore >= 70) {
            gradeResult = "C";
        } else if (totalScore >= 60) {
            gradeResult = "D";
        } else {
            gradeResult = "F";
        }

        return gradeResult;
    }
}
