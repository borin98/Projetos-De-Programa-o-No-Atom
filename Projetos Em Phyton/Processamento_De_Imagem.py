import numpy as np # importanto a biblioteca do numpy com nome np

#obs : é interessante estudar algelin depois, pois envolve conseitos de operações de matrizes no corpo dos reais em Rn

A = np.arange(24) #criando a matriz de tamanho 24 com 24 elemento da forma n , sendo que n começa com 0
print(A)

A = np.arange( 8,8+24).reshape(4,6) # fazendo uma operaçao de soma de matriz e mudando seu formato de 4 linhas e 6 colunas, somando com 8 elementos em cada coluna daquela matriz
#sempre colocar primeiro o que vai somar, depois colocar o que será somado depois na forma de array, refazendo depois a matriz na forma de 4 linhas e 6 colunas
print(A)

# create a boolean matrix B with True if the element of A é less than 15 (without using a loop)
B = A < 15
print("A = \n", A)
print("B = \n", B)

print(A.sum(axis=0)) #faz o print das linhas
print(A.sum(axis=1)) #faz o print das colunas

# what is the number of dimensions of the array C = A.sum(axis=0)?
#R: It must be 1 because it is the sum a 2d array in one axis
C = A.sum(axis=0)
print("number of dimensions = ", C.ndim)

# compute the mean value of the array A
mean = C.sum(axis=0)/(A.shape[0] * A.shape[1])
print("mean = ", mean)

# create a matrix C that is a normalization of A, so that its value are between 0.0 and 1.0
C = A - np.min(A)
C = C/np.max(C)

print("C = \n", C)

# create a matrix D that is a nomalization of the columns of A, so that each column of D has values between 0. and 1.
D = A - np.min(A,axis=0)
D = D / D.max(axis=0)
print("D = \n", D)

# this operation is called slicing:
AA = A[:,1::2]
print(AA)

# create matrix AB with the odd rows of matrix A, using the concept of slicing:
AB = A[1::2,:]
print("AB = \n", AB)

# create a matrix AC which is a rotation of 90 degrees anti-clockwise of the matrix A
%timeit AC = np.rot90(A)
%timeit AC = A.T[::-1,:]

AC = A.T[::-1,:]

print("AC = \n", AC)

%timeit E = np.dot(A, A.T)
%timeit E = A.dot(A.T)

E = np.dot(A, A.T) # está fazendo uma transformação linear do vetor para a base desejada

print(E)

F = A.reshape(2,4,3)
print(F)
