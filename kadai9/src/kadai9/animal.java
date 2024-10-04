package kadai9;

import java.util.Scanner;

public class animal {
    public static void main(String[] args) {
        // コンソールから入力を受け取る
        Scanner scanner = new Scanner(System.in);
        System.out.println("コンソールに文字を入力してください");
        String input = scanner.nextLine();
        
        // 入力文字列を動物ごとに分割
        String[] animalsData = input.split(",");
        
        // 動物ごとのデータを処理
        for (String animalData : animalsData) {
            String[] parts = animalData.split(":");
            String name = parts[0];
            double length = Double.parseDouble(parts[1]);
            int speed = Integer.parseInt(parts[2]);

            // 学名を動物名に基づいて設定
            String scientificName = getScientificName(name);

            // 出力
            System.out.println("動物名：" + name);
            System.out.println("体長：" + length + "m");
            System.out.println("速度：" + speed + "km/h");
            System.out.println("学名：" + scientificName);
            System.out.println();
        }
        
        scanner.close();
    }
    
    // 学名を動物名に基づいて取得するメソッド
    private static String getScientificName(String name) {
        switch (name) {
            case "ライオン":
                return "パンテラ レオ";
            case "ゾウ":
                return "ロキソドンタ・サイクロティス";
            case "パンダ":
                return "アイルロポダ・メラノレウカ";
            case "チンパンジー":
                return "パン・トゥログロディテス";
            case "シマウマ":
                return "チャップマンシマウマ";
            case "インコ":
                return "不明"; // 学名が不明の場合
            default:
                return "不明"; // 学名が未登録の場合
        }
    }
}
