import javax.swing.*;
import java.awt.*;

public class RpiCtlMain extends JFrame {
    public static void main(String[] args) {
        RpiCtlMain rpi = new RpiCtlMain(args);
    }

    /**
     * コンストラクタ(Constructor)
     * インスタンスを作る処理を行う。(Create instance)
     *
     * 1.プログラム引数を受け取る
     *　　[0]:タイトル
     */
    public RpiCtlMain(String[] args) {
        // 親クラスのコンストラクタを呼び出す
        // Call constructor of parent class
        super();

        // JFramewを作成するこのクラスが
        // JFrameを継承しているのでこのクラスを作成する

        // デフォルトの画面タイトル
        this.setTitle("Hello RPi Swing!");
        // プログラム引数がある時
        if (args.length > 0) {
            // １個目の引数をタイトルにセット
            this.setTitle(args[0]);
        }
        // コンポーネントを追加する
        Container con = this.getContentPane();
        con.add(new Label("Hello Swing ! This is Label"));

        // 画面サイズ
        this.setSize(500, 500);

        // 画面が終了したらプログラムも終了する設定
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // パック(コンポーネントのサイズに合わせる)
        this.pack();
        // 表示設定をする(しないと何もおきずに終了してしまう
        this.setVisible(true);

    }
}
