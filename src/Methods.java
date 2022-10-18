import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Methods {
    public int[] makeMiddle(int[] nums) {
        int firstCenterIndex = (nums.length / 2) - 1;
        int secondCenterIndex = (nums.length / 2);
        int numsFirstCenterIndex = nums[firstCenterIndex];
        int numsSecondCenterIndex = nums[secondCenterIndex];
        int[] centerValues = new int[2];
        centerValues[0] = numsFirstCenterIndex;
        centerValues[1] = numsSecondCenterIndex;
        return centerValues;
    }

    public int[] makeEnds(int[] nums) {
        int[] endNums = new int[2];
        endNums[0] = nums[0];
        endNums[1] = nums[nums.length - 1];
        return endNums;
    }

    public boolean no23(int[] nums) {
        return nums[0] != 2 && nums[0] != 3 && nums[1] != 2 && nums[1] != 3;

    }


    public int teaParty(int tea, int candy) {
        if (((tea / candy) >= 2 || (candy / tea) >= 2) && (tea >= 5 && candy >= 5)) {
            return 2;
        } else if (tea >= 5 && candy >= 5) {
            return 1;
        } else {
            return 0;
        }
    }

    public int maxMod5(int a, int b) {
        if (a > b) {
            return a;
        } else if (b > a) {
            return b;
        } else if (b % 2 == a % 2) {
            return Math.max(a, b);
        } else {
            return 0;
        }
    }

    public boolean sameFirstLast(int[] nums) {
        return nums.length >= 1 && nums[0] == nums[nums.length - 1];

    }

    public int[] midThree(int[] nums) {
        int[] midThreeArray = new int[3];
        if (nums.length == 3) {
            return nums;
        } else {
            midThreeArray[0] = nums[(nums.length / 2) - 1];
            midThreeArray[1] = nums[(nums.length) / 2];
            midThreeArray[2] = nums[(nums.length / 2) + 1];
            return midThreeArray;
        }
    }

    public int[] plusTwo(int[] a, int[] b) {
        int[] fourLengthArray = new int[4];
        fourLengthArray[0] = a[0];
        fourLengthArray[1] = a[1];
        fourLengthArray[2] = b[0];
        fourLengthArray[3] = b[1];
        return fourLengthArray;
    }

    public int maxTriple(int[] nums) {
        int firstNum = nums[0]; //5
        int middleNum = nums[nums.length / 2]; //3
        int lastNum = nums[nums.length - 1]; // 9
        if ((firstNum > middleNum) && (firstNum > lastNum)) {
            return firstNum;
        } else if ((middleNum > firstNum) && (middleNum > lastNum)) {
            return middleNum;
        } else {
            return lastNum;
        }
    }

    public int start1(int[] a, int[] b) {
        int[] totalSumOfEl = new int[2];
        int totalSum = 0;
        if (a.length > 0 && b.length > 0 && a[0] == 1 && b[0] == 1) {
            totalSumOfEl[0] = a[0];
            totalSumOfEl[1] = b[0];
            totalSum = totalSumOfEl.length;
        } else if (a.length > 0 && a[0] == 1) {
            totalSumOfEl[0] = a[0];
            totalSum = totalSumOfEl.length - 1;
        } else if (b.length > 0 && b[0] == 1) {
            totalSumOfEl[0] = b[0];
            totalSum = totalSumOfEl.length - 1;
        } else if (a.length == 0 && b.length == 0) {
            return 0;
        }
        return totalSum;
    }

    public boolean commonEnd(int[] a, int[] b) {
        return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];
    }

    public int[] maxEnd3(int[] nums) {
        int max = Math.max(nums[0], nums[2]);
        nums[0] = max;
        nums[1] = max;
        nums[2] = max;
        return nums;
    }

    public String middleThree(String str) {
        if (str.length() == 3) {
            return str;
        } else {
            return str.substring((str.length() / 2) - 1, (str.length() / 2) + 2);
        }
    }

    public int[] reverse3(int[] nums) {
        int[] reverseArray = new int[3];
        reverseArray[0] = nums[2];
        reverseArray[1] = nums[1];
        reverseArray[2] = nums[0];
        return reverseArray;
    }

    public int[] middleWay(int[] a, int[] b) {
        int middleOfA = a[a.length / 2];
        int middleOfB = b[b.length / 2];
        int[] middleWayArray = new int[2];
        middleWayArray[0] = middleOfA;
        middleWayArray[1] = middleOfB;
        return middleWayArray;
    }

    public int[] fix23(int[] nums) {
        if (nums[0] == 2 && nums[1] == 3) {
            nums[1] = 0;
        } else if (nums[1] == 2 && nums[2] == 3) {
            nums[2] = 0;
        }
        return nums;
    }

    public int countEvens(int[] nums) {
        int count = 0;
        for (int eventNum : nums) {
            if (eventNum % 2 == 0) {
                count++;
            }
        }
        return count;


    }

    public int sum13(int[] nums) {
        int totalCount = 0;
        if (nums.length > 0) {
            for (int i : nums) {
                if (i == 13) {
                    break;
                } else {
                    totalCount = i + totalCount;
                }
            }
        } else {
            return 0;
        }
        return totalCount;
    }

    public boolean lucky13(int[] nums) {
        boolean lucky13 = true;
        for (int i : nums) {
            if (i != 1 && i != 3) {
                lucky13 = true;
            } else {
                lucky13 = false;
                break;
            }
        }
        return lucky13;
    }

    public int[] fizzArray(int n) {
        int[] fizzArray = new int[n];
        for (int i = 0; i <= fizzArray.length - 1; i++) {
            fizzArray[i] = i;
        }
        return fizzArray;
    }

    public int matchUp(int[] nums1, int[] nums2) {
        int matchCount = 0;
        int calculate = 0;
        if (nums1.length > 0 && nums2.length > 0) {
            for (int i = 0; i <= nums1.length - 1; i++) {
                calculate = nums1[i] - nums2[i];
                if (Math.abs(calculate) >= 1 && Math.abs(calculate) <= 2) {
                    matchCount++;
                }
            }
        } else {
            matchCount = 0;
        }
        return matchCount;
    }

    public boolean hasBad(String str) {
        boolean hasBed = true;
        if (str.length() > 3) {
            if (str.substring(0, 3).equals("bad") || str.substring(1, 4).equals("bad")) {
                hasBed = true;
            } else {
                hasBed = false;
            }
        } else if (str.length() == 3) {
            if (str.substring(0, 3).equals("bad")) {
                hasBed = true;
            } else {
                return false;
            }
        } else {
            hasBed = false;
        }
        return hasBed;
    }


    public String lastChars(String a, String b) {
        if (a.length() > 0 && b.length() > 0) {
            return a.substring(0, 1) + b.substring(b.length() - 1);
        } else if (a.length() > 0 && b.length() == 0) {
            return a.substring(0, 1) + "@";
        } else if (a.length() == 0 && b.length() > 0) {
            return "@" + b.substring(b.length() - 1);
        } else {
            return "@@";
        }

    }


    public String conCat(String a, String b) {
        if (a.length() > 0 && b.length() > 0 && a.substring(2).equals(b.substring(0, 1))) {
            return a.substring(0, 2) + b;
        } else {
            return a + b;
        }
    }

    public boolean frontAgain(String str) {
        return str.length() >= 2 && str.substring(str.length() - 2).equals(str.substring(0, 2));
    }

    public String right2(String str) {
        if (str.length() >= 3) {
            return str.substring(str.length() - 2) + str.substring(0, str.length() - 2);
        } else {
            return str;
        }
    }

    public String middleTwo(String str) {
        if (str.length() >= 2) {
            return str.substring(str.length() / 2 - 1, str.length() / 2 + 1);
        } else {
            return str;
        }
    }

    public String deFront(String str) {
        if (str.length() >= 3 && str.charAt(0) == 'a' && str.charAt(1) == 'b') {
            str = String.valueOf(str.charAt(0)) + String.valueOf(str.charAt(1)) + str.substring(2);
        } else if (str.length() >= 3 && str.charAt(0) == 'a') {
            str = String.valueOf(str.charAt(0)) + str.substring(2);
        } else if (str.length() >= 3 && str.charAt(1) == 'b') {
            str = String.valueOf(str.charAt(1)) + str.substring(2);
        } else if (str.length() == 2 && str.charAt(0) == 'a' && str.charAt(1) == 'b') {
            str = String.valueOf(str.charAt(0)) + String.valueOf(str.charAt(1));
        } else if (str.length() <= 2 && str.charAt(0) == 'a') {
            str = String.valueOf(str.charAt(0));
        } else if (str.length() >= 3) {
            str = str.substring(2);
        } else {
            str = "";
        }
        return str;
    }


    public Map<String, String> mapBully(Map<String, String> map) {
        if (map.containsKey("a") && !map.get("a").isEmpty()) {
            map.put("b", map.get("a"));
            map.put("a", "");
        }
        return map;
    }

    public Map<String, String> topping1(Map<String, String> map) {
        if (map.containsKey("ice cream")
        ) {
            map.put("ice cream", "cherry");
            map.put("bread", "butter");
        } else {
            map.put("bread", "butter");
        }
        return map;

    }

    public Map<String, String> mapAB2(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b") && map.get("a").equals(map.get("b"))) {
            map.remove("a");
            map.remove("b");
        }
        return map;
    }

    public Map<String, String> mapShare(Map<String, String> map) {
        if (map.containsKey("a") && !map.get("a").isEmpty()) {
            map.put("b", map.get("a"));

        }
        map.remove("c");
        return map;

    }

    public Map<String, String> topping2(Map<String, String> map) {
        if (map.containsKey("ice cream") && !map.get("ice cream").isEmpty()) {
            map.put("yogurt", map.get("ice cream"));
        }
        if (map.containsKey("ice cream") && !map.get("ice cream").isEmpty() && map.containsKey("spinach") && !map.get("spinach").isEmpty()) {
            map.put("yogurt", map.get("ice cream"));
            map.put("spinach", "nuts");
        }
        if (map.containsKey("spinach") && !map.get("spinach").isEmpty()) {
            map.put("spinach", "nuts");
        }
        return map;
    }

    public Map<String, String> mapAB3(Map<String, String> map) {
        if (map.containsKey("a") && !map.containsKey("b")) {
            map.put("b", map.get("a"));
        } else if (map.containsKey("b") && !map.containsKey("a")) {
            map.put("a", map.get("b"));
        }
        return map;
    }

    public Map<String, String> mapAB(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            map.put("ab", map.get("a") + map.get("b"));
        }
        return map;
    }

    public Map<String, String> topping3(Map<String, String> map) {
        if (map.containsKey("potato") && !map.get("potato").isEmpty() && map.containsKey("salad") && !map.get("salad").isEmpty()) {
            map.put("fries", map.get("potato"));
            map.put("spinach", map.get("salad"));
        }
        if (map.containsKey("potato") && !map.get("potato").isEmpty()) {
            map.put("fries", map.get("potato"));
        }
        if (map.containsKey("salad") && !map.get("salad").isEmpty()) {
            map.put("spinach", map.get("salad"));
        }
        return map;
    }

    public Map<String, String> mapAB4(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b") && map.get("a").length() > map.get("b").length()) {
            map.put("c", map.get("a"));
        }
        if (map.containsKey("a") && map.containsKey("b") && map.get("a").length() < map.get("b").length()) {
            map.put("c", map.get("b"));
        }
        if (map.containsKey("a") && map.containsKey("b") && map.get("a").length() == map.get("b").length()) {
            map.put("a", "");
            map.put("b", "");
        }
        return map;
    }

    public Map<String, Integer> word0(String[] strings) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String string : strings
        ) {
            map.put(string, 0);
        }
        return map;
    }


    public Map<String, Integer> wordLen(String[] strings) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String string : strings
        ) {
            map.put(string, string.length());
        }
        return map;

    }

    public Map<String, String> pairs(String[] strings) {
        HashMap<String, String> map = new HashMap<>();
        for (String string : strings
        ) {
            map.put(string.substring(0, 1), string.substring(string.length() - 1));
        }
        return map;
    }

    public String doubleChar(String str) {
        String doubleCharString = "";
        for (int i = 0; i < str.length(); i++) {
            doubleCharString += String.valueOf(str.charAt(i)) + (str.charAt(i));
        }
        return doubleCharString;
    }

    public int countCode(String str) {
        int countCode = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.substring(i, i + 4).matches("(.*)co[dpo]{1,1}e(.*)"))
                countCode++;
        }
        return countCode;
    }

    public String repeatEnd(String str, int n) {
        int x = 0;
        String repeatEndString = "";
        while (x < n) {
            repeatEndString += str.substring(str.length() - n);
            x++;
        }
        return repeatEndString;
    }

    public boolean prefixAgain(String str, int n) {
        return str.substring(n).matches("(.*)" + str.substring(0, n) + "(.*)");
    }

    public boolean sameStarChar(String str) {
        String firstSubstringEl = "";
        String secondSubstringEl = "";
        boolean sameStarChar = true;
        for (int i = 0; i <= str.length() - 3; i++) {
            String substring = str.substring(i, i + 3);
            firstSubstringEl = substring.substring(0, 1);
            secondSubstringEl = substring.substring(substring.length() - 1);
            if (substring.matches("(.*)[*](.*)") && firstSubstringEl.equals(secondSubstringEl)) {
                sameStarChar = true;
                break;
            } else {
                sameStarChar = false;
            }
        }
        return sameStarChar;
    }

    public List<Integer> doubling(List<Integer> nums) {
        return nums.stream()
                .map(n -> n*2).collect(Collectors.toList());

    }

    public List<String> copies3(List<String> strings) {
        return strings.stream().map(e -> e+e+e).collect(Collectors.toList());
    }

    public List<Integer> square(List<Integer> nums) {
        return nums.stream()
                .map(n -> n*n)
                .collect(Collectors.toList());
    }

    public List<String> moreY(List<String> strings) {
        return strings.stream()
                .map(s -> "y"+s+"y")
                .collect(Collectors.toList());
    }

    public List<String> lower(List<String> strings) {
        return strings.stream()
                .map(String::toLowerCase).collect(Collectors.toList());
    }

    public List<String> addStar(List<String> strings) {
        return strings.stream()
                .map(s -> s+"*")
                .collect(Collectors.toList());
    }

    public List<Integer> math1(List<Integer> nums) {
        return nums.stream()
                .map(n -> (n+1)*10)
                .collect(Collectors.toList());
    }

    public List<Integer> rightDigit(List<Integer> nums) {
        return nums.stream()
                .map(n -> n%10)
                .collect(Collectors.toList());
    }

    public List<String> noX(List<String> strings) {
        return strings.stream()
                .map(s -> s.replace("x", ""))
                .collect(Collectors.toList());
    }

    public List<Integer> noNeg(List<Integer> nums) {
        return 
    }

}