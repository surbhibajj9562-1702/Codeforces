<h2><a href="https://codeforces.com/contest/1186/problem/A" target="_blank" rel="noopener noreferrer">1186A — Vus the Cossack and a Contest</a></h2>

| | |
|---|---|
| **Difficulty** | 800 |
| **Language** | Java 21 |
| **Verdict** | ✅ Accepted |
| **Problem Link** | [Codeforces 1186A](https://codeforces.com/contest/1186/problem/A) |

## Topics
`implementation`

---

## Problem Statement

<div class="header"><div class="title">A. Vus the Cossack and a Contest</div><div class="time-limit"><div class="property-title">time limit per test</div>1 second</div><div class="memory-limit"><div class="property-title">memory limit per test</div>256 megabytes</div><div class="input-file input-standard"><div class="property-title">input</div>standard input</div><div class="output-file output-standard"><div class="property-title">output</div>standard output</div></div><div><p>Vus the <a href="https://en.wikipedia.org/wiki/Cossacks">Cossack</a> holds a programming competition, in which $$$n$$$ people participate. He decided to award them all with pens and notebooks. It is known that Vus has exactly $$$m$$$ pens and $$$k$$$ notebooks.</p><p>Determine whether the Cossack can reward <span class="tex-font-style-bf">all</span> participants, giving each of them at least one pen and at least one notebook.</p></div><div class="input-specification"><div class="section-title">Input</div><p>The first line contains three integers $$$n$$$, $$$m$$$, and $$$k$$$ ($$$1 \leq n, m, k \leq 100$$$) — the number of participants, the number of pens, and the number of notebooks respectively.</p></div><div class="output-specification"><div class="section-title">Output</div><p>Print "<span class="tex-font-style-tt">Yes</span>" if it possible to reward all the participants. Otherwise, print "<span class="tex-font-style-tt">No</span>".</p><p>You can print each letter in any case (upper or lower).</p></div><div class="sample-tests"><div class="section-title">Examples</div><div class="sample-test"><div class="input"><div class="title">Input<div title="Copy" data-clipboard-target="#id007641415729719655" id="id00922301997380585" class="input-output-copier">Copy</div></div><pre id="id007641415729719655">5 8 6
</pre></div><div class="output"><div class="title">Output<div title="Copy" data-clipboard-target="#id002959923652539357" id="id00053975802351625135" class="input-output-copier">Copy</div></div><pre id="id002959923652539357">Yes
</pre></div><div class="input"><div class="title">Input<div title="Copy" data-clipboard-target="#id009310353120928634" id="id003445953761130348" class="input-output-copier">Copy</div></div><pre id="id009310353120928634">3 9 3
</pre></div><div class="output"><div class="title">Output<div title="Copy" data-clipboard-target="#id007121791840606986" id="id009032488385556818" class="input-output-copier">Copy</div></div><pre id="id007121791840606986">Yes
</pre></div><div class="input"><div class="title">Input<div title="Copy" data-clipboard-target="#id0019240224529600358" id="id009888554376522714" class="input-output-copier">Copy</div></div><pre id="id0019240224529600358">8 5 20
</pre></div><div class="output"><div class="title">Output<div title="Copy" data-clipboard-target="#id008125126145758013" id="id0018852684813886478" class="input-output-copier">Copy</div></div><pre id="id008125126145758013">No
</pre></div></div></div><div class="note"><div class="section-title">Note</div><p>In the first example, there are $$$5$$$ participants. The Cossack has $$$8$$$ pens and $$$6$$$ notebooks. Therefore, he has enough pens and notebooks.</p><p>In the second example, there are $$$3$$$ participants. The Cossack has $$$9$$$ pens and $$$3$$$ notebooks. He has more than enough pens but only the minimum needed number of notebooks.</p><p>In the third example, there are $$$8$$$ participants but only $$$5$$$ pens. Since the Cossack does not have enough pens, the answer is "<span class="tex-font-style-tt">No</span>".</p></div>