from abc import ABCMeta, abstractmethod


# Classe abstrata de exibição
class NomeExibir(metaclass=ABCMeta):

	def __str__(self):
		return ("{} {}".format(self.nome, self.sobrenome))


# Classe abstrata
class NomeFormatador(metaclass=ABCMeta):

	@abstractmethod
	def __init__(self, nome_completo: str):
		pass

	@abstractmethod
	def formatar(self, nome_completo: str):
		pass

# Classe concreta
class NomeSobrenome(NomeFormatador, NomeExibir):

	def __init__(self, nome_completo: str):
		self.formatar(nome_completo)

	def formatar(self, nome_completo):
		nome, sobrenome = nome_completo.split(' ')
		self.nome = nome
		self.sobrenome = sobrenome

# Classe concreta
class SobrenomeNome(NomeFormatador, NomeExibir):

	def __init__(self, nome_completo: str):
		self.formatar(nome_completo)

	def formatar(self, nome_completo):
		sobrenome, nome = nome_completo.split(', ')
		self.nome = nome
		self.sobrenome = sobrenome


# Fabrica de nomes
def FactoryNome(*args):
	nomes = []

	for nome in args:
		if ", " in nome:
			nomes.append(SobrenomeNome(nome))
		else:
			nomes.append(NomeSobrenome(nome))

	for nome in nomes:
		print(nome)

	return nomes



FactoryNome("McNealy, Scott", "James Gosling", "Naughton, Patrick")