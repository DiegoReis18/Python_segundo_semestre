s1=input("Digite um frase: ")
s2=input("Digite outra frase: ")
s1t=len(s1)
s2t=len(s2)
print("\n",s1," tem tamanho ",s1t)
print(s2," tem tamanho ",s2t,"\n")

if s1t>s2t:
    print(s1," é maior do que ",s2,"\n")
elif s1t==s2t:
    print(s1," tem o mesmo tamanho do que ",s2,"\n")
elif s1t<s2t:
     print(s1," é menor do que ",s2,"\n")


if s1==s2:
    print("Possuem o mesmo conteudo")
else:
    print("São frases diferentes")
    
