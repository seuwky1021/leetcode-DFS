from time import sleep
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.action_chains import ActionChains

def enter():
    browser.implicitly_wait(10)
    browser.get(
        'https://study.enaea.edu.cn/circleIndexRedirect.do?action=toNewMyClass&type=course&circleId=91116&syllabusId=525312&isRequired=true&studentProgress=2')
    browser.maximize_window()
    sleep(1)


def log():
    browser.find_element(By.CSS_SELECTOR,
                         "#pc-form .form-item:nth-child(1) > .input-control:nth-child(1) > .form-control").click()
    browser.find_element(By.CSS_SELECTOR,
                         "#pc-form .form-item:nth-child(1) > .input-control:nth-child(1) > .form-control").send_keys(
        number)
    browser.find_element(By.CSS_SELECTOR,
                         "#pc-form .form-item:nth-child(1) > .input-control-second > .form-control").click()
    browser.find_element(By.CSS_SELECTOR,
                         "#pc-form .form-item:nth-child(1) > .input-control-second > .form-control").send_keys(password)
    browser.find_element(By.CSS_SELECTOR, ".form-item:nth-child(1) > .mb15 > .btn").click()
    sleep(1)
    print("登录成功！")


def display():
    try:
        browser.find_element(By.ID, "replaybtn").click()
    except:
        pass

    try:
        list1 = browser.find_elements(By.CSS_SELECTOR, ".cvtb-MCK-CsCt-title.cvtb-text-ellipsis")
        list2 = browser.find_elements(By.CSS_SELECTOR, ".cvtb-MCK-CsCt-studyProgress")
    except:
        pass

    for j in range(0, len(list2)):
        print(list1[j].text)
        while True:
            if list2[j].text == "100%":
                print("\r完成")
                if j < len(list2) - 1:
                    list1[j + 1].click()
                    sleep(1)
                    try:
                        browser.find_element(By.ID, "replaybtn").click()
                    except:
                        pass
                    break
                else:
                    return
            else:
                try:
                    browser.find_element(By.CSS_SELECTOR, "button").click()
                except:
                    pass
                else:
                    global n
                    print("\n第" + str(n) + "次检测到弹窗")
                    n += 1

                list3 = '\r' + list2[j].text
                print(list3, end='')
                sleep(3)

    return


def find_course():
    global i
    if i % 2 != 0:
        course_string = ".even:nth-child(" + str(i) + ") .course-title"
        value_string = ".even:nth-child(" + str(i) + ") .progressvalue"
    else:
        course_string = ".odd:nth-child(" + str(i) + ") .course-title"
        value_string = ".odd:nth-child(" + str(i) + ") .progressvalue"
    course = browser.find_element(By.CSS_SELECTOR, course_string)
    value = browser.find_element(By.CSS_SELECTOR, value_string).text
    print("章节名："+course.get_attribute("title"))

    if value != "100%":
        if i % 2 != 0:
            learn_string = ".even:nth-child(" + str(i) + ") .golearn"
        else:
            learn_string = ".odd:nth-child(" + str(i) + ") .golearn"

        current = browser.current_window_handle

        element = browser.find_element(By.CSS_SELECTOR, learn_string)
        actions = ActionChains(browser)
        actions.move_to_element(element).click().perform()

        handles = browser.window_handles
        for handle in handles:
            if handle != current:
                browser.switch_to.window(handle)
        sleep(1)
        display()
        browser.close()
        browser.switch_to.window(current)
        browser.refresh()
        sleep(1)
        i += 1


    else:
        print("本章全部完成！")
        i += 1


if __name__ == '__main__':
    print("请输入账号/手机号：", end='')
    number = input()
    print("请输入密码：", end='')
    password = input()
    print("chromedriver是否安装在默认位置上？(y/n)", end='')
    install = input()
    if install == 'y':
        browser = webdriver.Chrome(r"C:\Program Files\Google\Chrome\Application\chromedriver.exe")
    else:
        print("请输入安装的绝对路径地址：", end='')
        short_path = input()
        path = short_path+r"\chromedriver.exe"
        browser = webdriver.Chrome(path)

    i = 2
    n = 1
    enter()
    log()

    while True:
        try:
            find_course()
        except:
            i += 1
