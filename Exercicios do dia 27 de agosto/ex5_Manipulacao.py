#Exercicio 5 - dia 27/08
print("Digite o valor da variavel x")
x = float(input())
print("Digite o valor da variavel y")
y = float(input())

print("\nVALORES ORIGINAIS")
print("x = ",x)
print("y = ",y,"\n")

aux = x
x = y
y = aux

print("VALORES TROCADOS")
print("x = ",x)
print("y = ",y)
