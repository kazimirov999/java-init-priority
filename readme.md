Create a few class that extend each other and show in console initialization order od static, no-static blocks and constructors
A, B extends A, C extends B

<b>Result</b>    

Initialized static variable in class A  <br />
<b>Static block A was called</b> <br />
Initialized static variable in class B <br />
<b>Static block B was called</b> <br />
Initialized static variable in class C <br />
<b>Static block C was called</b> <br />
Initialized no-static variable in class A <br />
<b>No-static block A was called</b> <br />
Constructor A called <br />
<b>Initialized no-static variable in class B</b> <br />
No-static block B was called <br />
<b>Constructor B called</b> <br />
Initialized no-static variable in class C <br />
<b>No-static block C was called</b> <br />
Constructor C called <br />