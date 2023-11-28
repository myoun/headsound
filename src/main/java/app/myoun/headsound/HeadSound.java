package app.myoun.headsound;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HeadSound {

    public static final Map<Character, Character> headSoundPair;
    static {
        Map<Character, Character> hsMap = new HashMap<>();
        hsMap.put('라', '나');
        hsMap.put('락', '낙');
        hsMap.put('란', '난');
        hsMap.put('람', '남');
        hsMap.put('랄', '날');
        hsMap.put('랍', '납');
        hsMap.put('랑', '낭');
        hsMap.put('래', '내');
        hsMap.put('랭', '냉');
        hsMap.put('냑', '약');
        hsMap.put('략', '약');
        hsMap.put('냥', '양');
        hsMap.put('량', '양');
        hsMap.put('녀', '여');
        hsMap.put('려', '여');
        hsMap.put('녁', '역');
        hsMap.put('력', '역');
        hsMap.put('년', '연');
        hsMap.put('련', '연');
        hsMap.put('녈', '열');
        hsMap.put('렬', '열');
        hsMap.put('념', '염');
        hsMap.put('렴', '염');
        hsMap.put('렵', '엽');
        hsMap.put('녕', '영');
        hsMap.put('령', '영');
        hsMap.put('녜', '예');
        hsMap.put('례', '예');
        hsMap.put('로', '노');
        hsMap.put('록', '녹');
        hsMap.put('론', '논');
        hsMap.put('롱', '농');
        hsMap.put('뢰', '뇌');
        hsMap.put('뇨', '요');
        hsMap.put('료', '요');
        hsMap.put('룡', '용');
        hsMap.put('루', '누');
        hsMap.put('뉴', '유');
        hsMap.put('류', '유');
        hsMap.put('뉵', '육');
        hsMap.put('륙', '육');
        hsMap.put('륜', '윤');
        hsMap.put('률', '율');
        hsMap.put('륭', '융');
        hsMap.put('륵', '늑');
        hsMap.put('름', '늠');
        hsMap.put('릉', '능');
        hsMap.put('니', '이');
        hsMap.put('리', '이');
        hsMap.put('린', '인');
        hsMap.put('림', '임');
        hsMap.put('립', '입');
        headSoundPair = Collections.unmodifiableMap(hsMap);
    }


    public static Character transform(Character character) {
        return headSoundPair.getOrDefault(character, character);
    }

    public static String transformWord(String word) throws HeadSoundException {
        if (word.split(" ").length != 1) {
            throw new HeadSoundException("입력된 문자열이 단어가 아닙니다");
        }

        char head = word.charAt(0);
        char transformed = transform(head);

        return transformed + word.substring(1);
    }
}
