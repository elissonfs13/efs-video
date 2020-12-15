import conversor
import downloader
import playlist
import directory_converter


while True:
    print()
    print("Escolha uma opção: ")
    print("1 - Download de vídeo")
    print("2 - Trabalhar com vídeos de uma playlist")
    print("3 - Converter vídeo para áudio MP3")
    print("4 - Converter todos os vídeo da pasta DEFAULT para áudio MP3")
    print("5 - Sair")
    escolha = input(">> ")
    print()

    if escolha == '1':
        print("Digite a URL do vídeo: ")
        url = input(">> ")
        url_formated = url.replace('"', '').replace("'", '').strip()
        downloader.run(url_formated)
    elif escolha == '2':
        print("Digite a URL da playlist: ")
        url = input(">> ")
        url_formated = url.replace('"', '').replace("'", '').strip()
        print("Escolha uma opção: ")
        print("1 - Download de todos os vídeos da playlist")
        print("2 - Salvar urls dos vídeos da playlist em um arquivo csv")
        escolha_playlist = input(">> ")
        if escolha_playlist == '1' or escolha_playlist == '2':
            playlist.run(url_formated, escolha_playlist)
        else:
            print("Opção inválida!")
    elif escolha == '3':
        print("Digite o nome do vídeo: ")
        name = input(">> ")
        conversor.run(name)
    elif escolha == '4':
        directory_converter.run()
    elif escolha == '5':
        print("Fim da execução do teste")
        break
    else:
        print("Opção inválida!")
