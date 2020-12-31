import platform
import pytube
import youtube_dl


def get_path():
    so = platform.system()
    if so == 'Windows':
        return r'..\efs-resources\videos'
    elif so == 'Linux':
        return r'../efs-resources/videos'
    else:
        return ''


def get_path_outtmpl():
    so = platform.system()
    path = get_path()
    if so == 'Windows':
        return path + r'\%(title)s.%(ext)s'
    elif so == 'Linux':
        return path + r'/%(title)s.%(ext)s'
    else:
        return ''


def run(url):
    try:
        youtube = pytube.YouTube(url)
        video = youtube.streams.get_highest_resolution()
        if video is not None:
            video.download(get_path())
            print("The video with url: " + url + " was downloaded successfully with pytube")
        else:
            ydl_opts = {'outtmpl': get_path_outtmpl()}
            with youtube_dl.YoutubeDL(ydl_opts) as ydl:
                ydl.download([url])
            print("The video with url: " + url + " was downloaded successfully with youtube_dl")
    except Exception as e:
        print("The video with url: " + url + " can't be downloaded")
        print(e)
1