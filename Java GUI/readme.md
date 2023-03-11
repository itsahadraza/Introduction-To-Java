<h1>JAVA GUI(Graphics User Interface)</h1>
<hr>
<h2>Introduction</h2>
<p>In these lab assignment, we are focusing on the basic structure of the GUI (Graphics User Interface) in java, how to write and run it in Java.</p>
<ul>
<li>Flow Layout</li>
</ul>
<p><b>Flow Layout</b> is the simplest layout manager. The components are arranged in the container from left to right in the order in which they were added. When one row is filled, a new row is started. You can specify the way the components are aligned by using one of three constants: <b>FlowLayout.RIGHT, FlowLayout.CENTER, or FlowLayout.LEFT</b>. Let’s create the following frame using Flow Layout: Creating a subclass of JFrame is necessary when you want to work with GUI. Then you can call the constructor to set the layouts and add controls.</p>
<ul>
<li>Grid Layout</li>
</ul>
<p>The <b>Grid Layout</b> manager arranges components in a grid (matrix) formation. The components are placed in the grid from left to right, starting with the first row, then the second, and so on, in the order in which they are added. Let’s create the following frame using Grid Layout</p>
<ul>
<li>Border Layout</li>
</ul>
<p><b>The Border Layout </b> manager divides a container into five areas: East, South, West, North, and Center. Components are added to a Border Layout by using add(Component, index), where index is a constant as mentioned below</p>
<ol>
<li>BorderLayout.EAST</li>
<li>BorderLayout.SOUTH</li>
<li>BorderLayout.WEST</li>
<li>BorderLayout.NORTH</li>
<li>BorderLayout.CENTER</li>
</ol>

