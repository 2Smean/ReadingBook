package tdd_test_case;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

// TDD 주도 개발 연습
// 점수 총합 90점 이상은 A, 80점 이상은 B, 70점 이상은 C, 60점 이상은 D, 나머지는 F
// assertEquals의 인자값을 "B"로 주고, 테스트 결과가 일치하는지 확인하는 과정을 진행
public class GradeTest {

    @Test
    public void scoreResult() {

        Score score = new Score(35, 25, 25); // Score 클래스 생성
        SimpleScoreStrategy scores = new SimpleScoreStrategy();

        String resultGrade = scores.computeGrade(score); // 점수 계산

        assertEquals("B", resultGrade); // 확인
    }
}
