import downloader
import conversor


while True:
    print()
    print("Escolha uma opção: ")
    print("1 - Download de vídeo")
    print("2 - Converter vídeo para áudio")
    print("3 - Sair")
    escolha = input(">> ")
    print()

    if escolha == '1':
        print("Digite a URL do vídeo: ")
        url = input(">> ")
        url_formated = url.replace('"', '').replace("'", '').strip()
        downloader.run(url_formated)
    elif escolha == '2':
        print("Digite o nome do vídeo: ")
        name = input(">> ")
        conversor.run(name)
    elif escolha == '3':
        print("Fim da execução do teste")
        break
    else:
        print("Opção inválida!")
