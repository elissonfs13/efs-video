import youtube_dl
import downloader
import writer_csv


def run(url, escolha_playlist):
    ydl = youtube_dl.YoutubeDL({'outtmpl': '%(id)s%(ext)s', 'quiet': True, })
    video = ""

    with ydl:
        result = ydl.extract_info(url, download=False)  # We just want to extract the info

        if 'entries' in result:
            # Can be a playlist or a list of videos
            video = result['entries']

            # loops entries to grab each video_url
            for i, item in enumerate(video):
                video = result['entries'][i]['webpage_url']
                print(video)
                if escolha_playlist == '1':
                    downloader.run(video)
                elif escolha_playlist == '2':
                    writer_csv.run(video)
                else:
                    print('Opção inválida!')
