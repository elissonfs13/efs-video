import platform
import os
import conversor


def get_path():
    so = platform.system()
    if so == 'Windows':
        return r'..\efs-resources\videos'
    elif so == 'Linux':
        return r'../efs-resources/videos'
    else:
        return ''


def run():
    for root, dirs, files in os.walk(get_path()):
        for file in files:
            print(file)
            conversor.run(file)
