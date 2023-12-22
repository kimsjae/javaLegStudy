package ch06.MiniProject;

import ch06.example4.Dark;

import java.util.ArrayList;
import java.util.List;

/**
 * 카드를 나타내는 Card클래스를 작성하고
 * 52개의 Card객체를 가지고 있는 Deck클래스를 작성한다
 * 각 클래스의 __str__() 메소드를 구현하여서 덱 안에 들어 있는 카드를 출력한다
 */

class Card {
    String name;
    String num;

    public Card(String name, String num) {
        this.name = name;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public String getNum() {
        return num;
    }

    @Override
    public String toString() {
        return (name + " " + num);
    }
}

class Deck {
    private List<Card> cards;

    public Deck() {
        cards = new ArrayList<>();

        String[] names = {"클럽", "다이아몬드", "하트", "스페이드"};
        String[] nums = {"에이스", "2", "3", "4", "5", "6", "7", "8", "9", "10", "잭", "퀸", "킹"};

        for (String name : names) {
            for (String num : nums) {
                cards.add(new Card(name, num));
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Card card : cards) {
            sb.append(card.toString()).append("\n");
        }
        return sb.toString();
    }
}

public class CardAndDeck {
    public static void main(String[] args) {
        Deck deck = new Deck();
        System.out.println(deck);
    }
}