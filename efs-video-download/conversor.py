import platform
import moviepy.editor
import os


def get_path_videos(name):
    so = platform.system()
    if so == 'Windows':
        return r'C:\efs-video-download\videos\\' + name
    elif so == 'Linux':
        return r'/usr/efs-video-download/videos/' + name
    else:
        return ''


def get_path_musicas(name):
    so = platform.system()
    if so == 'Windows':
        return r'C:\efs-video-download\musicas\\' + name
    elif so == 'Linux':
        return r'/usr/efs-video-download/musicas/' + name
    else:
        return ''


def run(name):
    file_name, file_ext = os.path.splitext(name)
    video = moviepy.editor.VideoFileClip(get_path_videos(name))
    audio = video.audio
    audio.write_audiofile(get_path_musicas(file_name + ".mp3"))
    print("Conversion complete successfully")
