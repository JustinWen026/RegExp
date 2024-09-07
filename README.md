# RegExp
PD-2 HW1

## README 文件

### 簡介 (Introduction)
本專案是一個使用 Java 實作的程式，透過處理輸入的字串檔案，根據以下規則進行判斷並輸出結果：
1. 判斷字串是否為迴文。
2. 判斷字串是否包含指定的字串 `str1`。
3. 判斷字串是否包含指定的字串 `str2` 超過或等於 n 次。
4. 判斷字串是否符合格式 `$a^mXb^{2m}$`，其中 a 和 b 可為大小寫字母且 m ≥ 1，X 可以是任意字串或空字串。

### 規則說明 (Rule Explanation)
1. **迴文檢測 (Palindrome Check)**:
   - 若字串正反讀相同，則判斷為迴文。
   - 英文字母大小寫不區分，因此 'ABC' 與 'cba' 被視為相同。

2. **包含指定字串 `str1` (Contains Specific String `str1`)**:
   - 判斷字串是否包含 `str1`，若有則輸出 `Y`，否則輸出 `N`。

3. **包含指定字串 `str2` 次數檢測 (Contains Specific String `str2` at Least n Times)**:
   - 判斷字串中 `str2` 出現的次數是否超過或等於 n 次，若符合條件則輸出 `Y`，否則輸出 `N`。

4. **匹配格式 `$a^mXb^{2m}$` (Matches Format `$a^mXb^{2m}$`)**:
   - 判斷字串是否包含格式為 a 或 A 重複 m 次，接著任意字串 X（可以是空字串），最後是 b 或 B 重複 2m 次。若符合則輸出 `Y`，否則輸出 `N`。

### 執行方式 (Execution)
請使用以下指令在命令行中執行此程式，並將輸出結果保存至對應的檔案中。

```bash
java RegExp <test_case_file> <str1> <str2> <n>
```

- `<test_case_file>`：測試檔案名稱
- `<str1>`：指定字串 1
- `<str2>`：指定字串 2
- `<n>`：字串 `str2` 出現的次數下限

範例：
```bash
java RegExp tc1 abc b 3 > ans1
```

### 輸入格式 (Input Format)
- 每一行的字串由英文字母（不分大小寫）、空白、標點符號組成。
- 每行字串的長度最多為 80 個字符。
- 測試檔案最多包含 1000 行字串。

### 輸出格式 (Output Format)
- 每行輸出結果包含 4 個 `Y` 或 `N`，分別對應以下規則的檢測結果：
  1. 是否為迴文。
  2. 是否包含字串 `str1`。
  3. 是否包含字串 `str2` 超過或等於 n 次。
  4. 是否符合格式 `$a^mXb^{2m}$`。

範例輸出：
```
N,N,N,N
Y,Y,N,N
Y,Y,N,N
Y,Y,N,N
Y,N,N,N
Y,N,N,N
N,N,Y,Y
N,Y,Y,Y
```

### 系統需求 (System Requirements)
- **Java 版本**：Java 8 或更新版本
- **記憶體設定**：最大可用 heap size 設定為 256MB，透過 `-Xmx256m` 參數設置。

### 例外處理 (Exception Handling)
- 若程式執行時間超過 10 分鐘或出現記憶體溢出 (Out of Memory) 的情況，該測試案例將視為失敗。

---

## README

### Introduction
This project is a Java-based program that processes input text files and checks for specific patterns according to the following rules:
1. Check if the string is a palindrome.
2. Check if the string contains the specific substring `str1`.
3. Check if the string contains the specific substring `str2` at least n times.
4. Check if the string follows the format `$a^mXb^{2m}$`, where a and b can be in any case, m ≥ 1, and X can be any string (including empty).

### Rule Explanation
1. **Palindrome Check**:
   - A string is considered a palindrome if it reads the same forward and backward.
   - Case insensitive, meaning 'ABC' and 'cba' are considered the same.

2. **Contains Specific String `str1`**:
   - Checks whether the string contains the substring `str1`. If it does, outputs `Y`, otherwise `N`.

3. **Contains Specific String `str2` at Least n Times**:
   - Checks if `str2` appears at least n times in the string. If so, outputs `Y`, otherwise `N`.

4. **Matches Format `$a^mXb^{2m}$`**:
   - Checks if the string contains a pattern of a or A repeated m times, followed by any string X (including empty), and then b or B repeated 2m times. If it matches, outputs `Y`, otherwise `N`.

### How to Run
Use the following command to run the program from the command line and save the output to the corresponding file:

```bash
java RegExp <test_case_file> <str1> <str2> <n>
```

- `<test_case_file>`: The name of the test file.
- `<str1>`: The specific substring 1.
- `<str2>`: The specific substring 2.
- `<n>`: The minimum number of occurrences of `str2`.

Example:
```bash
java RegExp tc1 abc b 3 > ans1
```

### Input Format
- Each line contains a string composed of English letters (case insensitive), spaces, and punctuation.
- Each line can contain up to 80 characters.
- The test file can contain up to 1000 lines.

### Output Format
- Each output line contains 4 `Y` or `N` values, corresponding to the results of the following checks:
  1. Whether it is a palindrome.
  2. Whether it contains `str1`.
  3. Whether it contains `str2` at least n times.
  4. Whether it matches the pattern `$a^mXb^{2m}$`.

Example output:
```
N,N,N,N
Y,Y,N,N
Y,Y,N,N
Y,Y,N,N
Y,N,N,N
Y,N,N,N
N,N,Y,Y
N,Y,Y,Y
```

### System Requirements
- **Java Version**: Java 8 or higher
- **Memory Setting**: The maximum heap size is set to 256MB, using the `-Xmx256m` option.

### Exception Handling
- If the program runs for more than 10 minutes or an out-of-memory exception occurs, the test case will be considered a failure.
