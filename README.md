# java-3rd-order-systems
A Java class that can be used to solve third-order systems of equations with augmented matrices.

# How to use
The constructor accepts 12 arguments of type int, found from the coefficients like so:

ax + by + cz = d

ex + fy + gz = h

ix + jy + kz = l

Then, for example, Matrix m = new Matrix(a, b, c, d, e, f, g, h, i, j, k, l);

To solve a matrix, use m.solve(), which returns a double[].
For example, double[] result = m.solve();

result[0] is the value of x,
result[1] is the value of y, and
result[2] is the value of z.
