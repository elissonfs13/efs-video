import os
import platform
import moviepy.editor


def get_path_videos(name):
    so = platform.system()
    if so == 'Windows':
        return r'..\efs-resources\videos\\' + name
    elif so == 'Linux':
        return r'../efs-resources/videos/' + name
    else:
        return ''


def get_path_musicas(name):
    so = platform.system()
    if so == 'Windows':
        return r'..\efs-resources\songs\\' + name
    elif so == 'Linux':
        return r'../efs-resources/songs/' + name
    else:
        return ''


def run(name):
    try:
        file_name, file_ext = os.path.splitext(name)
        video = moviepy.editor.VideoFileClip(get_path_videos(name))
        audio = video.audio
        audio.write_audiofile(get_path_musicas(file_name + ".mp3"))
        print("Conversion complete successfully")
    except Exception as e:
        print("The video with url: " + file_name + " can't be converted to mp3")
        print(e)
