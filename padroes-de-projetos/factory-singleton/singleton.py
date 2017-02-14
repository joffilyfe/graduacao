# Singleton
class Incremental:
	contador = 0
	numero = contador

	@staticmethod
	def incrementar():
		Incremental.contador = Incremental.contador + 1


# Singleton Pessoa
class Pessoa(object):
	_instancia = None

	def __init__(self, nome: str) -> None:
		self.nome = nome

	@staticmethod
	def getInstancia():
		if Pessoa._instancia is None:
			Pessoa._instancia = Pessoa('Joffily')

		return Pessoa._instancia


if __name__ == "__main__":
	# Incrementa uma vez
	Incremental().incrementar()
	print(Incremental.contador)

	#Incrementa a segunda vez
	Incremental().incrementar()
	print(Incremental.contador)


	pessoa = Pessoa.getInstancia()
	pessoa2 = Pessoa.getInstancia()

	print(pessoa.nome)
	# Mostramos os IDs dos objetos
	print(id(pessoa))
	print(id(pessoa2))