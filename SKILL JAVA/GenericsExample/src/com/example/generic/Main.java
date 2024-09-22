package com.example.generic;

public class Main {

	public static void main(String[] args) {
		Integer[] intArray = {3, 1, 4, 1, 5, 9};
        ComparableValue<Integer> intComparable = new IntegerComparable();
        System.out.println("Integer Max: " + intComparable.findMax(intArray));
        System.out.println("Integer Min: " + intComparable.findMin(intArray));

        // Test String
        String[] strArray = {"apple", "banana", "cherry"};
        ComparableValue<String> strComparable = new StringComparable();
        System.out.println("String Max: " + strComparable.findMax(strArray));
        System.out.println("String Min: " + strComparable.findMin(strArray));

        // Test Character
        Character[] charArray = {'a', 'z', 'd', 'b'};
        ComparableValue<Character> charComparable = new CharacterComparable();
        System.out.println("Character Max: " + charComparable.findMax(charArray));
        System.out.println("Character Min: " + charComparable.findMin(charArray));

        // Test Float
        Float[] floatArray = {3.14f, 2.71f, 1.41f, 1.61f};
        ComparableValue<Float> floatComparable = new FloatComparable();
        System.out.println("Float Max: " + floatComparable.findMax(floatArray));
        System.out.println("Float Min: " + floatComparable.findMin(floatArray));
    }

	}

