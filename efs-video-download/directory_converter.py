import platform
import os
import conversor


def get_path():
    so = platform.system()
    if so == 'Windows':
        return r'C:\efs-video-download\videos\toMP3'
    elif so == 'Linux':
        return r'/home/elissonfs/efs-video-download/videos/toMP3'
    else:
        return ''


def run():
    for root, dirs, files in os.walk(get_path()):
        for file in files:
            print(file)
            conversor.run(file)
