# terada

# 002 3の倍数
ユーザーに入力させた数字が3の倍数かどうかを判定する。 3の倍数の場合は"3の倍数です"、違う場合は"3の倍数ではありません"と表示する。
- 実例1
  - 数字を入力してください
    - 入力:3
    - 出力:"3の倍数です"
  - 計算を終了します。
   
- 実例2
  - 数字を入力してください
    - 入力:3.3
    - 出力:"3の倍数です"
   - 計算を終了します。
   
- 実例3
  - 数字を入力してください
    - 入力:8
    - 出力:"3の倍数ではありません"
   
 - 実例4
   - 数字を入力してください
     - 入力:(何も入力せず改行)
     - 出力:"数字を入力してください"の繰り返し
   - 数字を入力してください
     - 入力:3
     - 出力:"3の倍数です"
   - 計算を終了します。
   
 - 実例5
   - 数字を入力してください
     - 入力:ねこ
     - 出力:"数字を入力してください"の繰り返し

 - 実例6
    - 数字を入力してください
      - 入力:123(^^)/
      - 出力:"数字のみ入力してください"の繰り返し<br><br><br>

 - 事前準備
   -  ファイルを作る
      -  パッケージを決める
      -  arithmetic.javaを作る
   -  クラスを作る
      -  arithmeticクラスを書く
      -  空のmain()メソッドを作る
    
- 入力
 >System.out.println("数字を入力してください");<br>
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));<br>
		String str = reader.readLine();<br>
		int num = Integer.parseInt(str);<br>
   -  名前を入力する
      -  BufferedReaderを作る
          -  インポートする
          -  System.inを渡してnewする
          -  変数readerに格納する
      -  BufferedReader.reader()で数字、文字列を入力する
          -   reader.readLine()を呼ぶ
          -   String型のstrに格納する
          -   strをint型のnumに変換する。<br><br>
- 入力
 >System.out.println("数字を入力してください");<br>
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));<br>
		String str = reader.readLine();<br>
		int num = Integer.parseInt(str);<br>
   -  名前を入力する
      -  BufferedReaderを作る
          -  インポートする
          -  System.inを渡してnewする
          -  変数readerに格納する
      -  BufferedReader.reader()で数字、文字列を入力する
          -   reader.readLine()を呼ぶ
          -   String型のstrに格納する
          -   strをint型のnumに変換する。


