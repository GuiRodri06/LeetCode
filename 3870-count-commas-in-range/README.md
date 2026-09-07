<h2><a href="https://leetcode.com/problems/count-commas-in-range">3870. Count Commas in Range</a></h2><h3>Easy</h3><hr><p>Given an integer <code>n</code>, return the <em>total number of <strong>commas</strong></em> used when writing all integers from <code>1</code> to <code>n</code> in standard base-10 notation (with thousand separators).</p>

<p>In standard base-10 notation, a comma is inserted every three digits starting from the right (e.g., <code>1,000</code>, <code>1,000,000</code>).</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> n = 1003
<strong>Output:</strong> 4
<strong>Explanation:</strong> The numbers with commas are 1,000, 1,001, 1,002, and 1,003. Each contains 1 comma, so the total is 4.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> n = 999
<strong>Output:</strong> 0
<strong>Explanation:</strong> No numbers from 1 to 999 contain a comma.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
    <li><code>1 &lt;= n &lt;= 10<sup>9</sup></code></li>
</ul>