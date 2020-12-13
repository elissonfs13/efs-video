import csv
import platform


def get_path():
    so = platform.system()
    if so == 'Windows':
        return r'..\efs-file-reader\spark.csv'
    elif so == 'Linux':
        return r'../efs-file-reader/spark.csv'
    else:
        return ''


def run(url):
    with open(get_path(), 'a') as csv_file:
        wr = csv.writer(csv_file, delimiter=',', lineterminator='\n')
        wr.writerow([url])
        print("URL " + url + " saved in file 'spark.csv' successfully")
